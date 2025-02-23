package org.example.service;

import org.example.Dto.ProductDto;
import org.example.entity.Product;

public interface ProductService {

    public Product createProduct(ProductDto productDto);

    Product findOne(Long id);


}
