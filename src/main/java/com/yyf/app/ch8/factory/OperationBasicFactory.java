package com.yyf.app.ch8.factory;

import com.yyf.app.ch8.IFactory;
import com.yyf.app.ch8.Operation;
import com.yyf.app.ch8.operation.AddOperation;
import com.yyf.app.ch8.operation.DivOperation;
import com.yyf.app.ch8.operation.MulOperation;
import com.yyf.app.ch8.operation.SubOperation;

/**
 * 基础算法工厂
 */
public class OperationBasicFactory implements IFactory {


    @Override
    public Operation createOperation(String operationType) {
        Operation operation;
        switch (operationType) {
            case "+":
                operation = new AddOperation();
                break;

            case "-":
                operation = new SubOperation();
                break;

            case "*":
                operation = new MulOperation();

                break;
            case "/":
                operation = new DivOperation();
                break;

            default:
                operation = null;
        }
        return operation;
    }
}
