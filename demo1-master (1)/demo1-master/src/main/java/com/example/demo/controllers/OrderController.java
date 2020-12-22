package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Order;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	final static Logger logger = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	OrderService orderService;
	@PostMapping
	public int createOrder(String order){
		logger.debug("creating an order");
		return orderService.create();
	}
//	public List<Order> getOrders() {
//		
//	}
	
	@GetMapping //(produces = "application/xml")
	public Order getOrder(@RequestHeader("accept") String accept) {
		System.out.println(accept);
		logger.debug("getting an order");
		return orderService.getOrder();
	}
}
