package com.yyf.app.ch14;


import java.util.Observable;

public class Boss extends Observable {

    private String name;
    private String action;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
        super.setChanged();
        super.notifyObservers();
    }
}
