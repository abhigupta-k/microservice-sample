package com.abhi.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abhi.api.common.Payment;
import com.abhi.api.common.TransactionRequest;
import com.abhi.api.common.TransactionResponse;
import com.abhi.api.entity.Order;
import com.abhi.api.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private RestTemplate restTemp;

	@Autowired
	private OrderRepository repo;

	public TransactionResponse saveOrder(TransactionRequest request) {
		String response = "";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		// rest call                                             we could write only application name no need to write host and port
		Payment paymentResponse = restTemp.postForObject("http://Z-Payment-Service/payment/doPayment", payment,
				Payment.class);
		response = paymentResponse.getPaymentStatus().equals("success")
				? "payment processing successfull and order placed"
				: "there is failure in payment method";
		repo.save(order);
		return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(),
				response);
	}
}
