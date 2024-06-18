package jintran.ex3uploadfile.service;

import jintran.ex3uploadfile.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);

    void update(int id, Product product);
    void remove(int id);
}
