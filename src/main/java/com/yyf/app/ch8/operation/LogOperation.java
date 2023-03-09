package com.yyf.app.ch8.operation;

import com.yyf.app.ch8.Operation;

/**
 * 对数算法
 */
public class LogOperation implements Operation {
    @Override
    public double gerResult(double numA, double numB) {
        return Math.log(numA) / Math.log(numB);
    }
}
