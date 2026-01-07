package com.project.project1.service;

import com.project.project1.dao.IProductDao;
import com.project.project1.domainobject.Product;
import com.project.project1.serviceinterface.IProductService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    @Autowired
    private IProductDao productDao;


    @Override
    @Transactional
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    @Transactional
    public Product getProduct(Long id) {
        return productDao.getProduct(id);
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    @Transactional
    public double getProductPrice(Long id) {
        return productDao.getProductPrice(id);
    }
}
