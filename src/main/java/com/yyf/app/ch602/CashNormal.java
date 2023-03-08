package com.yyf.app.ch602;

/**
 * @author YYF.
 * date 2023/3/9 00:26.
 */
public class CashNormal implements ISale{

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
