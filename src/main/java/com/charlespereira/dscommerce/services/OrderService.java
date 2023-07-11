package com.charlespereira.dscommerce.services;

import com.charlespereira.dscommerce.dto.OrderDTO;
import com.charlespereira.dscommerce.entities.Order;
import com.charlespereira.dscommerce.repositories.OrderRepository;
import com.charlespereira.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found!"));
        OrderDTO dto = new OrderDTO(order);
        return dto;
    }
}
