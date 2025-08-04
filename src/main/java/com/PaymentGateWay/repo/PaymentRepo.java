package com.PaymentGateWay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentGateWay.entity.PaymentOrder;

public interface PaymentRepo  extends JpaRepository<PaymentOrder, Integer>{
	
	    

}
