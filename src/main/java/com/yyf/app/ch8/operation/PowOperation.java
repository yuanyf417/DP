package com.yyf.app.ch8.operation;

import com.yyf.app.ch8.Operation;

/**
 * 指数算法
 */
public class PowOperation implements Operation {
    @Override
    public double gerResult(double numA, double numB) {
        return Math.pow(numA, numB);
    }
}
