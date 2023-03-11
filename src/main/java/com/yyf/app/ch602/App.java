package com.yyf.app.ch602;

/**
 * @author YYF.
 * date 2023/3/9 00:42.
 */
public class App {

    public static void main(String[] args) {

        // 策略模式 就是打包方式
        CashContext cashContext = new CashContext(5);

        double result = cashContext.getResult(1000, 1);
        System.out.println(result);
    }
}
