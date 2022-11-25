package com.cgi.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.main.entity.BookOrder;
import com.cgi.main.service.OrderService;
@RestController
@RequestMapping("/api")
public class OrderController {
    
	@Autowired
	private OrderService orderService;
	@PostMapping("/orderadded")
	public ResponseEntity<?> addOrder(@RequestBody BookOrder order) {
		BookOrder newOrder=orderService.addOrder(order);
		if(newOrder!=null)
			return new ResponseEntity<BookOrder>(newOrder,HttpStatus.CREATED);
		return new ResponseEntity<String>("Order not added",HttpStatus.CONFLICT);
	}

	@GetMapping("/getorder")
	public ResponseEntity<?>  getOrder() {
		List<BookOrder> orderList=orderService.getOrder();
		if(orderList.size()>0)
		return new ResponseEntity<List<BookOrder>>(orderList,HttpStatus.OK);
		return new ResponseEntity<String>("Order list is empty",HttpStatus.OK);
	}

}

