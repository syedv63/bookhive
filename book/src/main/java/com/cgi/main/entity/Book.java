package com.cgi.main.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	@Id
	private String id;
	private String title;
	private String desc;
	private double price;
	private String author;
	private double ratings;
	
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Book(String id, String title, String desc, double price, String author, double ratings) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.price = price;
		this.author = author;
		this.ratings = ratings;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public double getRatings() {
		return ratings;
	}



	public void setRatings(double ratings) {
		this.ratings = ratings;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", desc=" + desc + ", price=" + price + ", author=" + author
				+ ", ratings=" + ratings + "]";
	}

	
	}