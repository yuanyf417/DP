package com.yyf.app.ch801;

import com.yyf.app.ch602.ISale;

import java.util.Objects;

/**
 * 改造
 * @see com.yyf.app.ch602.CashContext
 */
public class CashContext {

    private ISale sale;

    public CashContext(int cashType) {
        IFactory factory = null;
        switch (cashType) {
            //原件
            case 1:
                factory = new CashRebateReturnFactory(1D, 0D, 0D);
                break;
            // 打八折
            case 2:
                factory = new CashRebateReturnFactory(0.8D, 0D, 0D);
                break;
            // 满300 - 100
            case 3:
                factory = new CashRebateReturnFactory(1D, 300D, 100D);
                break;
            // 先打八折 再满300 - 100
            case 4:
                factory = new CashRebateReturnFactory(0.8D, 300D, 100D);
                break;
            // 先满300 - 100 再打八折
            case 5:
                factory = new CashReturnRebateFactory(0.8D, 300D, 100D);
                break;

        }
        if (Objects.isNull(factory)) throw new RuntimeException("factory is null");
        sale = factory.createSaleModel();
    }

    public double getResult(double price, int num) {
        return this.sale.acceptCash(price, num);
    }
}
