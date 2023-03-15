package com.yyf.app.ch17;

public class App {

    public static void main(String[] args) {
        Player forwards = new Forwards("巴蒂尔");
        forwards.attack();

        Player center = new Center("孙悟空");
        center.defense();

        Player yao = new Translator("YAO");
        yao.attack();
    }
}
