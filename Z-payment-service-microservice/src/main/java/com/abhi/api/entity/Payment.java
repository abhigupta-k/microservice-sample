package com.abhi.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId; //auto generate
	private String paymentStatus; // by random method
	private String transactionId; // by uuid generate
	private int orderId; //gave from rest call from order service
	private double amount; // gave from order servive

}
