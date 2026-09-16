package com.example.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }

    @GetMapping
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PutMapping("{id}")
    public void putProductById(@PathVariable Integer id, @RequestBody Product product)
    {
        productService.putProductById(id,product);
    }

    @PostMapping
    public void postProduct(@RequestBody Product product)
    {
        productService.postProduct(product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Integer id)
    {
        productService.deleteProductById(id);
    }
}
