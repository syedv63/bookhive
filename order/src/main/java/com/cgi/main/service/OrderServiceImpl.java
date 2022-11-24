package com.cgi.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.main.entity.BookOrder;
import com.cgi.main.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
    private OrderRepository orderRepository;
	
	public BookOrder addOrder(BookOrder order) {
		return orderRepository.save(order);
	}

	public List<BookOrder> getOrder() {
		return orderRepository.findAll();
	}

	
}
