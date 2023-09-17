package com.charlespereira.dscommerce.repositories;

import com.charlespereira.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
