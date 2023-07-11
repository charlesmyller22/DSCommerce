package com.charlespereira.dscommerce.repositories;

import com.charlespereira.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
