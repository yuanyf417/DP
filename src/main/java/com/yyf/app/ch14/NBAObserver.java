package com.yyf.app.ch14;

import java.util.Observable;
import java.util.Observer;

public class NBAObserver implements Observer {

    private final String name;

    public NBAObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Boss boss = (Boss) o;
        System.out.println(boss.getName() + boss.getAction() + this.name + ",快关闭NBA");
    }
}
