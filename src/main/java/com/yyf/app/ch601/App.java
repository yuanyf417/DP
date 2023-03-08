package com.yyf.app.ch601;

/**
 * @author YYF.
 * date 2023/3/8 23:40.
 */
public class App {

    public static void main(String[] args) {

        Gemen gemen = new Gemen("Mask");
        TeslaFuDecorator teslaFuDecorator = new TeslaFuDecorator();
        teslaFuDecorator.doFuGemen(gemen);
        RockFuDecorator rockFuDecorator = new RockFuDecorator();
        rockFuDecorator.doFuGemen(teslaFuDecorator);

        rockFuDecorator.showPower();

    }
}
