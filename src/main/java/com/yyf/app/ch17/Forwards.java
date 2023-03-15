package com.yyf.app.ch17;

public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("美国球员 前锋 进攻");
    }

    @Override
    public void defense() {
        System.out.println("美国球员 前锋 防守");
    }
}
