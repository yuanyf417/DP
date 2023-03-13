package com.yyf.app.ch13;

import java.util.ArrayList;

public class Product {

    ArrayList<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        parts.forEach(System.out::println);
    }
}
