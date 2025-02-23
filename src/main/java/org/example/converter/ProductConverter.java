package org.example.converter;

import org.example.Dto.ProductDto;
import org.example.entity.Category;
import org.example.entity.Product;

public class ProductConverter {
    public static Product convertDtoToEntity(ProductDto dto) {
        Product product = new Product();

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setQuantity(dto.getQuantity());
        product.setDescription(dto.getDescription());
        product.setCategory(
                new Category(dto.getCategoryId())
        );
        return product;
    }
}
