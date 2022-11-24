package com.cgi.main.service;

import java.util.List;

import com.cgi.main.entity.BookOrder;

public interface OrderService {

	public BookOrder addOrder(BookOrder order);
	public List<BookOrder> getOrder();
	
}
