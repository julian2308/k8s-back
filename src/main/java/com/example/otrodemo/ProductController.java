package com.example.otrodemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @CrossOrigin(origins = {"http://146.190.196.48:3000", "*"})
    @GetMapping(path = "/products")
    public List<String> getAllProducts() {
        return service.getProducts();
    }

    @CrossOrigin(origins = {"http://146.190.196.48:3000", "*"})
    @PostMapping(path = "/products/{text}")
    public String addProduct(@PathVariable("text") String text) {
        Product product = new Product(text);
        service.addProduct(product);
        return "Product created successfully";
    }

    @CrossOrigin(origins = {"http://146.190.196.48:3000", "*"})
    @GetMapping(path = "/prueba")
    public String prueba() {
        return "Funca";
    }

}
