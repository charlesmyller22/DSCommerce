package com.charlespereira.dscommerce.dto;

import com.charlespereira.dscommerce.entities.Category;
import com.charlespereira.dscommerce.entities.Product;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
    private Long id;
    @NotBlank(message = "Required field")
    @Size(min = 3, max = 80, message = "Name needs to have between 3 and 80 characters")
    private String name;
    private String description;
    @NotNull(message = "Field required")
    @Positive(message = "Price needs to be positive")
    private Double price;
    private String imgUrl;
    @NotEmpty(message = "There must be at least one category")
    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
        for(Category cat : entity.getCategories()) {
            categories.add(new CategoryDTO(cat));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }
}
