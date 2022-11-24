package com.cgi.main.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class BookOrder {

	@Id
	
	private String orderid;
	
	private String bookid;
	
	private String cartid;
	
	private String customerid;
	
	private String payment;
	
	private int total;
	
	private int qty;
	
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBid(String bookid) {
		this.bookid = bookid;
	}
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	public BookOrder(String orderid, String bookid, String cartid, String customerid, String payment, int total, int qty) {
		super();
		this.orderid = orderid;
		this.bookid = bookid;
		this.cartid = cartid;
		this.customerid = customerid;
		this.payment = payment;
		this.total = total;
		this.qty = qty;
		
	}
	public BookOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [ordeid=" + orderid + ", bookid=" + bookid + ", cartid=" + cartid + ", customerid=" + customerid + ", payment=" + payment
				+ ", total=" + total + ", qty=" + qty + ",]";
	}
	
	
	
	
	
}