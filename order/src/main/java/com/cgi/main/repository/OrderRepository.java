package com.cgi.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.main.entity.BookOrder;

@Repository

public interface OrderRepository extends JpaRepository<BookOrder,String>{
		List<BookOrder> findByOid(String OrderId);


}
