package com.abhi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
