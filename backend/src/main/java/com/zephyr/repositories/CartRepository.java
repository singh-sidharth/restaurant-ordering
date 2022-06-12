package com.zephyr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zephyr.models.CartDao;

public interface CartRepository extends JpaRepository<CartDao, Long>{

}
