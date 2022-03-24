package com.example.demospringaop.model;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {
    private String brand;
    private int pid;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", pid=" + pid +
                '}';
    }

    public void useProduct() {
        System.out.println("Using product.");
    }
}
