
/*
package com.PaymentGateWay.service;


import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PaymentGateWay.entity.PaymentOrder;
import com.PaymentGateWay.repo.paymentRepo;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.springframework.beans.factory.annotation.Value;


@Service
public class PaymentService {
	
	@Autowired 
	private paymentRepo paymentrepo;
	
	@Value("${razorpay.key.id}")
	private String razorpayKey;

	@Value("${razorpay.secret.key}")
	private String razorpaySecret;

	private RazorpayClient client;
	
	public PaymentOrder createOrder(PaymentOrder payOrder) throws Exception{
		
		JSONObject orderReq = new JSONObject();
		
		orderReq.put("amount", payOrder.getAmount()*100);
		
		orderReq.put("Currency", "INR");
		
	    orderReq.put("receipt", payOrder.getEmail());
	    
	    this.client = new RazorpayClient(razorpayKey,razorpaySecret );
	    
	    Order razorpayOrder = client.orders.create(orderReq);
	    
	    payOrder.setOrderID(razorpayOrder.get("id"));

	    payOrder.setOrderStatus(razorpayOrder.get("Status"));
	    
	    return paymentrepo.save(payOrder);
	    
	    
	    
		
	}
	

} */



package com.PaymentGateWay.service;

import com.PaymentGateWay.entity.PaymentOrder;
import com.PaymentGateWay.repo.PaymentRepo;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Value("${razorpay.key.id}")
    private String razorpayKey;

    @Value("${razorpay.secret.key}")
    private String razorpaySecret;

    public PaymentOrder createOrder(PaymentOrder payOrder) throws Exception {
        RazorpayClient client = new RazorpayClient(razorpayKey, razorpaySecret);

        JSONObject orderReq = new JSONObject();
        orderReq.put("amount", payOrder.getAmount() * 100); // convert ₹ to paise
        orderReq.put("currency", payOrder.getCurrency());
        orderReq.put("receipt", payOrder.getEmail());

        Order razorpayOrder = client.orders.create(orderReq);

        payOrder.setRazorpayOrderId(razorpayOrder.get("id"));
        payOrder.setOrderStatus(razorpayOrder.get("status"));
        payOrder.setAmount(razorpayOrder.get("amount")); // paise
        payOrder.setCurrency(razorpayOrder.get("currency"));

        return paymentRepo.save(payOrder);
    }
}






























