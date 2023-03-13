package com.yyf.app.ch13;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        Builder c1 = new ConcreteBuilder1();
        Builder c2 = new ConcreteBuilder2();
        director.construct(c1);
        Product result = c1.getResult();
        result.show();

        director.construct(c2);
        Product result2 = c2.getResult();
        result2.show();
    }
}
