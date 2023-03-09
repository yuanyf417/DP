package com.yyf.app.ch7;

/**
 * 真实对象
 *
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("真实对象的请求");
    }
}
