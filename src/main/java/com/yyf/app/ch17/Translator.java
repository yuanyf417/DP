package com.yyf.app.ch17;

public class Translator extends Player{

    private final ForeginCenter foreginCenter = new ForeginCenter("姚明");

    public Translator(String name) {
        super(name);
    }

    @Override
    public void attack() {
        foreginCenter.进攻();
    }

    @Override
    public void defense() {
        foreginCenter.防守();
    }
}
