package com.yyf.app.ch14;

public class App {

    public static void main(String[] args) {
        Boss boss = new Boss("老大");
        NBAObserver nbaObserver = new NBAObserver("NBA同事");
        StockObserver stockObserver = new StockObserver("韭菜");
        boss.addObserver(nbaObserver);
        boss.addObserver(stockObserver);
        boss.setAction("我回来了！");

        boss.deleteObserver(stockObserver);
        boss.setAction("我又回来了");
    }
}
