package com.abhi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
