package com.yyf.app.ch602;

/**
 * @author YYF.
 * date 2023/3/9 00:42.
 */
public class CashContext {

    private final ISale sale;

    public CashContext(int cashType) {

        switch (cashType){
            case 1:
                sale = new CashNormal();
                break;

            case 2:
                CashNormal cashNormal2 = new CashNormal();
                CashRebate cashRebate2 = new CashRebate(0.8D);
                cashRebate2.doCorate(cashNormal2);
                sale = cashRebate2;
                break;

            case 3:
                CashNormal cashNormal3 = new CashNormal();
                CashReturn cashReturn3 = new CashReturn(300D, 100D);
                cashReturn3.doCorate(cashNormal3);
                sale = cashReturn3;
                break;

            case 4:
                // 先满300 - 100, 在打8折 注意! 计算顺序 先满减的话就是装饰在最外层!!!!!!
                CashNormal cashNormal4 = new CashNormal();
                CashRebate cashRebate4 = new CashRebate(0.8D);
                cashRebate4.doCorate(cashNormal4);

                CashReturn cashReturn4 = new CashReturn(300D, 100D); // 最外层是满减
                cashReturn4.doCorate(cashRebate4);
                sale = cashReturn4;
                break;
            case 5:
                // 先打8折, 在满300 - 100  注意! 计算顺序 先打折的话就是装饰在最外层!!!!!!
                CashNormal cashNormal5 = new CashNormal();
                CashReturn cashReturn5 = new CashReturn(300D, 100D);
                cashReturn5.doCorate(cashNormal5);
                CashRebate cashRebate5 = new CashRebate(0.8D); // 最外层是打折
                cashRebate5.doCorate(cashReturn5);
                sale = cashRebate5;
                break;
            default:
                throw new RuntimeException("算法异常");
        }
    }

    public double getResult(double price, int num) {
        return this.sale.acceptCash(price, num);
    }
}
