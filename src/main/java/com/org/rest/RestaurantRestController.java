package com.org.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.dto.OrderResponse;
import com.org.service.RestaurantOrderService;

@RestController
public class RestaurantRestController {

	@Autowired
	private RestaurantOrderService restaurantOrderService;
	
	@GetMapping("/getOrder/{orderId}")
	public ResponseEntity<?> getOrder(@PathVariable String orderId) {
		OrderResponse response = restaurantOrderService.getOrders(orderId);
		return  ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	

}
