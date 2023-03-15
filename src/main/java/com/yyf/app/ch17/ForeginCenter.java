package com.yyf.app.ch17;

public class ForeginCenter {

    private String name;

    public ForeginCenter(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("中国球员 " + this.name + " 进攻");
    }

    public void 防守() {
        System.out.println("中国球员 " + this.name + " 防守");
    }
}
