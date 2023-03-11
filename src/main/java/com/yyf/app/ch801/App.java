package com.yyf.app.ch801;

/**
 * 工厂模式
 */
public class App {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext(5);
        double result = cashContext.getResult(1000D, 2);
        System.out.println(result);
    }
}
