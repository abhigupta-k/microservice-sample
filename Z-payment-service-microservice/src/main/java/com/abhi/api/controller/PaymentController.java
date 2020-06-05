package com.abhi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.api.entity.Payment;
import com.abhi.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService service;

	@PostMapping("/doPayment")
	public Payment doPaymnt(@RequestBody Payment payment) {
		return service.doPayment(payment);

	}
}
