package com.yyf.app.ch13;

/**
 * 指挥者
 * 负责组装调用建造者的方法
 */
public class Director {

    /**
     * 建造步骤/顺序
     * @param builder
     */
    public void construct(Builder builder) {

        builder.buildPartB();
        builder.buildPartA();
    }
}
