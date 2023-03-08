package com.yyf.app.ch602;

/**
 * @author YYF.
 * date 2023/3/9 00:28.
 */
public class CashSuper implements ISale{

    private ISale sale;

    public void doCorate(ISale sale) {
        this.sale = sale;
    }

    @Override
    public double acceptCash(double price, int num) {
        if (sale != null)
            return sale.acceptCash(price, num);
        else
            return 0;
    }
}
