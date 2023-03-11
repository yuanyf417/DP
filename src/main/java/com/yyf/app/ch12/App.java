package com.yyf.app.ch12;

/**
 * 外观模式
 */
public class App {

    public static void main(String[] args) {

        Facade facade = new Facade(new SubSystemOne(), new SubSystemTwo(), new SubSystemThree());
        facade.all();
        System.out.println("----------");
        facade.g1();
    }
}
