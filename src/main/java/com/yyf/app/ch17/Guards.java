package com.yyf.app.ch17;

public class Guards extends Player{

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("美国球员 " + this.name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("美国球员 " + this.name + " 防守");
    }
}
