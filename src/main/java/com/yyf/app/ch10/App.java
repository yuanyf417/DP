package com.yyf.app.ch10;

public class App {

    public static void main(String[] args) {
        Xiaoh xiaoh = new Xiaoh();
        String h = xiaoh.answer1();
        String h1 = xiaoh.answer2();
        System.out.println(h + "--" + h1);
        System.out.println("-----");
        Xiaom xiaom = new Xiaom();
        String m = xiaom.answer1();
        String m1 = xiaom.answer2();
        System.out.println(m + "--" + m1);
    }
}
