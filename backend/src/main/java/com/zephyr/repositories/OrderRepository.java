package com.zephyr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zephyr.models.OrderDao;

public interface OrderRepository extends JpaRepository<OrderDao, String> {
	@Query("Select o.orderId from OrderDao o where o.mobileNumber=?1 and o.paymentStatus='pending'")
	List<Long> findOrderId(String mobileNumber);
	
	@Modifying
	@Query("Update OrderDao o set o.paymentStatus='completed' where o.orderId= :id")
	void updatePaymentStatusByOrderId(@Param("id")long orderId);
}
