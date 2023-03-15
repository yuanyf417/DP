package com.yyf.app.ch18;

public class App {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setLife(100);
        gameRole.setName("矮人狙击手");

        System.out.println("开打前");
        System.out.println(gameRole);

        // save point
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        RoleStateMemento roleStateMemento = gameRole.saveLife();
        caretaker.setRoleStateMemento(roleStateMemento);

        // 团战
        gameRole.fight();
        System.out.println("开打后");
        System.out.println(gameRole);

        // 回泉水
        gameRole.recoveryLife(caretaker.getRoleStateMemento());
        System.out.println("回复");
        System.out.println(gameRole);


    }
}
