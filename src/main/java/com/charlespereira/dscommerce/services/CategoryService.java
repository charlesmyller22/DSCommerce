package com.charlespereira.dscommerce.services;

import com.charlespereira.dscommerce.dto.CategoryDTO;
import com.charlespereira.dscommerce.dto.ProductMinDTO;
import com.charlespereira.dscommerce.entities.Category;
import com.charlespereira.dscommerce.entities.Product;
import com.charlespereira.dscommerce.repositories.CategoryRepository;
import com.charlespereira.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(x-> new CategoryDTO(x)).toList();
    }
}
