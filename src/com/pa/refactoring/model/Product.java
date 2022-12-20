package com.pa.refactoring.model;

/**
 * @author André Sabino
 */
public class Product {
    String name;
     double cost;
   double iva;



    public Product(String name, double cost, double iva) {
        this.name = name;
        this.cost = cost;
        this.iva=iva;
    }



    @Override
    public String toString() {
        return name + " (" + cost + ')';
    }
}
