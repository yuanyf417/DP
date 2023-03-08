package com.yyf.app.ch602;

/**
 * @author YYF.
 * date 2023/3/9 00:29.
 */
public class CashReturn extends CashSuper{

    /**
     * 满多少
     */
    private final double moneyCondition;

    /**
     * 减多少
     */
    private final double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double v = price * num;
        if (moneyCondition > 0 && v >= moneyCondition)
            v = v - Math.floor(v / moneyCondition) * moneyReturn;
        return super.acceptCash(v, 1);
    }
}
