package com.yyf.app.ch18;

/**
 * 角色存储状态
 */
public class RoleStateMemento {

    private int life;

    public RoleStateMemento(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
