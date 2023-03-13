package com.yyf.app.ch13;

public class ConcreteBuilder2 extends Builder{
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("C部件");
    }

    @Override
    public void buildPartB() {
        product.add("D部件");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
