package com.sgtest.programs;

   class Product{
       Product(String name){
           System.out.println("Product Name:"+name);
       }
       Product(double price){
           this("Lenovo head phone");
           System.out.println("Price of the produt:"+price);
       }
   }

public class ConstructorChaningDemo {
    public static void main(String args[]){
        Product p1=new Product(500.125);
        Product p2=new Product("Lenovo head phone");
    }
}
