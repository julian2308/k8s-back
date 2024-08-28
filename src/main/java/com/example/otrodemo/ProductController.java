package com.example.otrodemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/products")
    public List<String> getAllProducts() {
        return service.getProducts();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/products/{text}")
    public String addProduct(@PathVariable("text") String text) {
        Product product = new Product(text);
        service.addProduct(product);
        return "Product created successfully";
    }

    @GetMapping(path = "/prueba")
    public String prueba() {
        return "Funca";
    }

}
