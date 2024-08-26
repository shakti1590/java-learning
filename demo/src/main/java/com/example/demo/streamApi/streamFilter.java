package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.List;

public class streamFilter {
    public static void main(String[] args) {
        List <Product> list = new ArrayList<Product>();
        //
        for (Product product : getProducts()){
            if(product.getPrice() > 25000f){
                list.add(product);
            }
        }
        for (Product product : list){
            System.out.println(product);
        }
        System.out.println("***********************");
        // using stream
        getProducts()
            .stream().filter((product) -> product.getPrice()>25000f)
                .forEach(System.out::println);
        }
        private static List<Product> getProducts(){
        List <Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop" , 29000f));
        productList.add(new Product(2, "dell", 30000f));
        productList.add(new Product(3, "lenovo", 26000f));
        productList.add(new Product(4, "hp", 27000f));
        productList.add(new Product(5, "Asus", 28000f));
        return productList;

    }
}
class Product {
    private int id;
    private String name;
    private float price;

    public  Product(int id, String name , float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }
@Override
    public String toString(){
        return "Product [id = "+id+",name="+name+",price="+price+"]";
}
}
