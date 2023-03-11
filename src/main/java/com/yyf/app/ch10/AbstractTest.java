package com.yyf.app.ch10;

public abstract class AbstractTest {

    public void test1() {
        System.out.println("1. xxxx?");
        this.answer1();
    }

    public void test2() {
        System.out.println("2. xxxx?");
        this.answer2();
    }

    public abstract String answer1();
    public abstract String answer2();
}
