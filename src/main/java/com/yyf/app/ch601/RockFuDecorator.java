package com.yyf.app.ch601;

/**
 * @author YYF.
 * date 2023/3/8 23:36.
 */
public class RockFuDecorator extends FuDecorator {
    @Override
    public void showPower() {
        System.out.println("有火箭");
        super.showPower();
    }
}
