package com.spring.RestAPIQuestions.Question2;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final List<Product> products = List.of(
            new Product(1, "Laptop", 50000),
            new Product(2, "Mobile", 20000),
            new Product(3, "Keyboard", 1500),
            new Product(4, "Mouse", 800)
    );

    public Optional<Product> findById(long id) {

        return products.stream()
                .filter(product -> product.id() == id)
                .findFirst();
    }
}