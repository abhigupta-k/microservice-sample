package com.abhi.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.api.entity.Payment;
import com.abhi.api.repository.PaymentRepository;
@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repo;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(processPayment());
		payment.setTransactionId(UUID.randomUUID().toString());
		
		return repo.save(payment);
	}

	private String processPayment() {
		return new Random().nextBoolean()?"success" : "fail";
		
	}
}
