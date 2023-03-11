package com.yyf.app.ch12;

public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;


    public Facade(SubSystemOne subSystemOne, SubSystemTwo subSystemTwo, SubSystemThree subSystemThree) {
        this.subSystemOne = subSystemOne;
        this.subSystemTwo = subSystemTwo;
        this.subSystemThree = subSystemThree;
    }

    public void all() {
        subSystemOne.m1();
        subSystemTwo.m2();
        subSystemThree.m3();
    }

    public void g1() {
        subSystemOne.m1();
        subSystemTwo.m2();
    }
}
