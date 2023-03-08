package com.yyf.app.ch601;

/**
 * @author YYF.
 * date 2023/3/8 23:33.
 */
public class FuDecorator implements FuGemen {

    protected FuGemen fuGemen;

    @Override
    public void showPower() {
        if (fuGemen != null) {
            fuGemen.showPower();
        }
    }

    public void doFuGemen(FuGemen fuGemen) {
        this.fuGemen = fuGemen;
    }
}
