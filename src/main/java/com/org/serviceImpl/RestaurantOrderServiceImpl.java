package com.org.serviceImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.org.dto.OrderResponse;
import com.org.service.RestaurantOrderService;

@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService{

	
	@Override
	public OrderResponse getOrders(String orderId) {
		
		return  genenerateOrder().get(orderId);
	}
	private Map<String, OrderResponse> genenerateOrder() {
        Map<String, OrderResponse> orderMap = new HashMap<>();
        orderMap.put("35fds631", new OrderResponse("35fds63", "VEG-MEALS", 1, 199, new Date(), "READY", 15));
        orderMap.put("9u71245h", new OrderResponse("9u71245h", "HYDERABADI DUM BIRYANI", 2, 641, new Date(), "PREPARING", 59));
        orderMap.put("37jbd832", new OrderResponse("37jbd832", "PANEER BUTTER MASALA", 1, 325, new Date(), "DELIVERED", 0));
		return orderMap;
       
	}
	

}
