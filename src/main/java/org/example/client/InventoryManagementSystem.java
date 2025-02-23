package org.example.client;

import org.example.Dto.ProductDto;
import org.example.entity.Category;
import org.example.entity.Product;
import org.example.service.ProductService;
import org.example.service.ProductServiceImpl;

import java.util.Scanner;

public class InventoryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add Product");
        System.out.println("2. Display all products");
        System.out.println("3. Find specific product");
        //...

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                createProduct(scanner);
                break;
            case 2:
                displayAllProducts();
                break;
            case 3:
                findProductByID(scanner);
                break;


        }
    }

    private static void createProduct(Scanner scanner) {
        System.out.println("Enter product name: ");
        String name = scanner.next();
        System.out.println("Enter product price: ");
        Double price = scanner.nextDouble();
        System.out.println("Enter product quantity: ");
        Integer quantity = scanner.nextInt();
        System.out.println("Enter product description: ");
        String description = scanner.next();
        System.out.println("Enter category id: ");
        Long categoryId = scanner.nextLong();

        Category categoryObj = new Category();




        ProductDto productDto = new ProductDto();
        productDto.setName(name);
        productDto.setPrice(price);
        productDto.setQuantity(quantity);
        productDto.setDescription(description);
        productDto.setCategoryId(categoryId);

        ProductService productService= new ProductServiceImpl();
        productService.createProduct(productDto);
    }

    private static void displayAllProducts() {



    }

    private static void findProductByID(Scanner scanner) {
        System.out.println("Enter product id");
        int id = scanner.nextInt();
        ProductService productService = new ProductServiceImpl();
        Product product = productService.findOne((long) id);
        if (product != null) {
            System.out.println(product);
        }else{
            System.out.println("Invalid product id");
        }
    }
}
