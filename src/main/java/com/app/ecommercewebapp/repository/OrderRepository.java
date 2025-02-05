package com.app.ecommercewebapp.repository;
import com.app.ecommercewebapp.model.Order;
import com.app.ecommercewebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
