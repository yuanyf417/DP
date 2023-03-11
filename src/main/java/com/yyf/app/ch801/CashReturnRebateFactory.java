package com.yyf.app.ch801;

import com.yyf.app.ch602.CashNormal;
import com.yyf.app.ch602.CashRebate;
import com.yyf.app.ch602.CashReturn;
import com.yyf.app.ch602.ISale;

/**
 * 先满减 在打折
 */
public class CashReturnRebateFactory implements IFactory{

    private double moneyRebate;

    private double moneyCondition;

    private double moneyReturn;

    public CashReturnRebateFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSaleModel() {

        CashNormal cn = new CashNormal();
        CashRebate cashRebate = new CashRebate(this.moneyRebate);
        cashRebate.doCorate(cn);
        CashReturn cr = new CashReturn(this.moneyCondition, this.moneyReturn);
        cr.doCorate(cashRebate);
        return cr;
    }
}
