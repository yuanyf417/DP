package com.yyf.app.ch8.factory;

import com.yyf.app.ch8.IFactory;
import com.yyf.app.ch8.Operation;
import com.yyf.app.ch8.operation.*;

/**
 * 高级算法工厂
 */
public class OperationAdvancedFactory implements IFactory {


    @Override
    public Operation createOperation(String operationType) {
        Operation operation;
        switch (operationType) {
            case "pow":
                operation = new PowOperation();
                break;

            case "log":
                operation = new LogOperation();
                break;

            default:
                operation = null;
        }
        return operation;
    }
}
