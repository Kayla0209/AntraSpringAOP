package com.example.demospringaop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private Long uid;

    @Autowired // search by type
    @Qualifier("product") // search by name
    private Product product;

    public User() {
        System.out.println("Object created.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void show() {
        System.out.println("Show!");
        product.useProduct();
    }
}
