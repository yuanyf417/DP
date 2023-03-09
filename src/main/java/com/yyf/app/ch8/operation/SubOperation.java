package com.yyf.app.ch8.operation;

import com.yyf.app.ch8.Operation;

/**
 * 减法算法
 */
public class SubOperation implements Operation {

    @Override
    public double gerResult(double numA, double numB) {
        return numA - numB;
    }
}
