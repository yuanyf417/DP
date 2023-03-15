package com.yyf.app.ch18;

import lombok.Data;
import lombok.ToString;

@ToString
public class GameRole {

    private String name;

    private int life;

    public RoleStateMemento saveLife() {
        return new RoleStateMemento(this.life);
    }

    public void recoveryLife(RoleStateMemento roleStateMemento) {
        this.life = roleStateMemento.getLife();
    }

    public void fight() {
        this.life = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
