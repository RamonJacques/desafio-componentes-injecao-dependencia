package com.ramon.desafiocid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramon.desafiocid.entities.Order;

@Service
public class OrderService {

	@Autowired
	ShippingService shippingService;
	
	public Double total(Order order) {
		return order.getBasic()-((order.getDiscount()/100)*order.getBasic()) + shippingService.shipment(order);
	}
}
