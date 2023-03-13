package com.yyf.app.ch13;

public class ConcreteBuilder1 extends Builder{
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("A部件");
    }

    @Override
    public void buildPartB() {
        product.add("B部件");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
