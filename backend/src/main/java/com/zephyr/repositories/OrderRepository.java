package com.zephyr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zephyr.models.OrderDao;

@Repository
public interface OrderRepository extends JpaRepository<OrderDao, String> {

}
