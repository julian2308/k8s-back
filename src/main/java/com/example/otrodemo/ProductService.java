package com.example.otrodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(){

        List<Product> products = repository.findAll();
        List<String> values = new ArrayList<String>();
        for (Product product : products) {
            values.add(product.getValue());
        }

        return values;
    }

    public void addProduct(Product product){
        repository.save(product);
    }
}
