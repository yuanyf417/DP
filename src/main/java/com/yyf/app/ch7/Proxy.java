package com.yyf.app.ch7;

public class Proxy implements ISubject{

    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        this.realSubject.request();
    }
}
