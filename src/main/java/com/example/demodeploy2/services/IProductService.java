package com.example.demodeploy2.services;

import com.example.demodeploy2.models.Product;

public interface IProductService {
    Iterable<Product> getList();
    Product save(Product product);
    void delete(Long id);
}
