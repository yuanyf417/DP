package com.yyf.app.ch801;

import com.yyf.app.ch602.CashNormal;
import com.yyf.app.ch602.CashRebate;
import com.yyf.app.ch602.CashReturn;
import com.yyf.app.ch602.ISale;

/**
 * 先打折 在满减
 */
public class CashRebateReturnFactory implements IFactory{

    private double moneyRebate;

    private double moneyCondition;

    private double moneyReturn;

    public CashRebateReturnFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSaleModel() {

        CashNormal cn = new CashNormal();
        CashReturn cr = new CashReturn(this.moneyCondition, this.moneyReturn);
        cr.doCorate(cn);

        CashRebate cashRebate = new CashRebate(this.moneyRebate);
        cashRebate.doCorate(cr);

        return cashRebate;
    }
}
