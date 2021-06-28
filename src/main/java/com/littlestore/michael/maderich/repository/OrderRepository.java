package com.littlestore.michael.maderich.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.littlestore.michael.maderich.entity.Customer;
import com.littlestore.michael.maderich.entity.Order;
 
public interface OrderRepository extends CrudRepository<Order, Integer> {
	public List<Order> findByCustomer(Customer customer);
	
//	@Query(value = "SELECT DISTINCT p.categorySpecific FROM product p "
//			+ "WHERE p.categoryMain = :mainCat ORDER BY p.categorySpecific", nativeQuery=true)
}