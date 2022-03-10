package com.example.productservice.service;


import com.example.productservice.model.Product;

import java.util.List;

public interface ProductService{
    public Product createProduct(Product product);
    public List<Product> getAllProduct();
}
