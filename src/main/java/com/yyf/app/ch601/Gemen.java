package com.yyf.app.ch601;

/**
 * 马斯克
 * @author YYF.
 * date 2023/3/8 23:31.
 */
public class Gemen implements FuGemen {

    private String name;

    public Gemen(String name) {
        this.name = name;
    }

    @Override
    public void showPower() {
        System.out.println(name + "是富哥们");
    }
}
