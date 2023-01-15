package ro.mycode.manageshoponline.service;

import org.springframework.stereotype.Service;
import ro.mycode.manageshoponline.model.Product;
import ro.mycode.manageshoponline.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
