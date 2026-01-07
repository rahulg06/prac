package com.project.project1.dao;

import com.project.project1.domainobject.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class ProductDao implements IProductDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public void addProduct(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product getProduct(Long id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        Query query = entityManager.createQuery("select p from Product");
        List<Product> products = query.getResultList();
        return products;
    }

    @Override
    public double getProductPrice(Long id) {
        Query query = entityManager.createQuery("select p.price from Product where p.id=:id");
        query.setParameter("id", id);
        double price = (double)query.getSingleResult();
        return price;
    }
}
