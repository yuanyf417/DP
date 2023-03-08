package com.yyf.app.ch602;

/**
 * @author YYF.
 * date 2023/3/9 00:39.
 */
public class CashRebate extends CashSuper{

    private double moneyRebae = 1d;

    public CashRebate(double moneyRebae) {
        this.moneyRebae = moneyRebae;
    }

    @Override
    public double acceptCash(double price, int num) {
        double v = price * num;
        v = v * moneyRebae;
        return super.acceptCash(v, 1);
    }
}
