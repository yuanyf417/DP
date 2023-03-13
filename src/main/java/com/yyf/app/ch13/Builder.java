package com.yyf.app.ch13;

/**
 * 抽象的建造者
 * 具有哪些建造方法及返回建造成果
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();

    public abstract Product getResult();
}
