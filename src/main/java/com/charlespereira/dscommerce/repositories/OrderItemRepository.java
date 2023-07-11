package com.charlespereira.dscommerce.repositories;

import com.charlespereira.dscommerce.entities.OrderItem;
import com.charlespereira.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
