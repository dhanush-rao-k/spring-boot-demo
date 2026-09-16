package com.example.SpringBoot;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).get();
    }

    public void postProduct(Product product){
        productRepository.save(product);
    }

    public void putProductById(Integer id, Product product){
        Product ProductById=productRepository.findById(id).get();
        ProductById.setName(product.getName());
        ProductById.setCategory(product.getCategory());
        productRepository.save(ProductById);
    }

    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }
}
