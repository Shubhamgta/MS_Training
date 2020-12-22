package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.demo.models.Address;
import com.example.demo.models.Order;


@Service
public class OrderService {
	final static Logger logger = LoggerFactory.getLogger(OrderService.class);
	public int create() {
		return 1;
	}
	
	public Order getOrder() {
		List<Address> addresses = new ArrayList<>();
		Address address = new Address();
		address.setPin(323232);
		address.setStreet("1st Main");
		addresses.add(address);
		Order order = new Order();
		order.setId(1);
		order.setItem("Laptop");
		order.setPrice(23000.0F);
		order.setAddresses(addresses);
		return order;
	}
}
