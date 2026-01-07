package com.project.project1.dao;

import com.project.project1.domainobject.Product;

import java.util.List;

public interface IProductDao {
    public void addProduct(Product product);
    public Product getProduct(Long id);
    public List<Product> getAllProducts();
    public double getProductPrice(Long id);
}
