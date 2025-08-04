/*

package com.PaymentGateWay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PaymentGateWay.entity.PaymentOrder;
import com.PaymentGateWay.service.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService payServices;

	@GetMapping("/")

	public String init() {

		return "index";

	}

	@PostMapping(value = "/create-order", produces = "application/json")
	@ResponseBody

	public ResponseEntity<PaymentOrder> createOrder(@RequestBody PaymentOrder paymentOrder) throws Exception {

		PaymentOrder createOrders = payServices.createOrder(paymentOrder);

		return new ResponseEntity<>(createOrders, HttpStatus.CREATED);

	}

} */


package com.PaymentGateWay.controller;

import com.PaymentGateWay.entity.PaymentOrder;
import com.PaymentGateWay.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PaymentController {

    @Autowired
    private PaymentService payServices;

    @Value("${razorpay.key.id}")
    private String razorpayKey;

    @GetMapping("/")
    public String init() {
        return "index"; // loads index.html
    }

    @PostMapping(value = "/create-order", produces = "application/json")
    
    @ResponseBody
    public ResponseEntity<Map<String, Object>> createOrder(@RequestBody PaymentOrder paymentOrder) throws Exception {
      
    	PaymentOrder savedOrder = payServices.createOrder(paymentOrder);

        Map<String, Object> response = new HashMap<>();
        response.put("id", savedOrder.getRazorpayOrderId());
        response.put("amount", savedOrder.getAmount());
        response.put("currency", savedOrder.getCurrency());
        response.put("name", savedOrder.getName());
        response.put("email", savedOrder.getEmail());
        response.put("phno", savedOrder.getPhno());
        response.put("course", savedOrder.getCourse());
        response.put("key", razorpayKey);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}

































