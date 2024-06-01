package com.app.ecommercewebapp.service;

import com.app.ecommercewebapp.model.Category;
import com.app.ecommercewebapp.model.Product;
import com.app.ecommercewebapp.repository.CategoryRepository;
import com.app.ecommercewebapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;
    public void addProduct(Product product){productRepository.save(product);}
    public List<Product> getAllProduct(){ return productRepository.findAll();}
    public void deleteProductById(long id){ productRepository.deleteById(id);}
    public Optional<Product> getProductById(long id){return productRepository.findById(id);}
    public List<Product> getAllProductByCategoryId(int id){return productRepository.findAllByCategoryId(id);}
}
