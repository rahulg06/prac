package com.project.project1.serviceinterface;

import com.project.project1.domainobject.Product;

import java.util.List;

public interface IProductService {
    public void addProduct(Product product);
    public Product getProduct(Long id);
    public List<Product> getAllProducts();
    public double getProductPrice(Long id);

}
