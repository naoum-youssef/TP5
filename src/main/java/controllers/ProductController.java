package controllers;

import entities.Product;
import metier.ProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductDaoImpl productDaoImpl;

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productDaoImpl.findAll();
        model.addAttribute("products", products);
        return "products"; // Vue : products.jsp
    }
}
