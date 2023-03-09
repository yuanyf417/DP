package com.yyf.app.ch8;

import com.yyf.app.ch8.factory.OperationAdvancedFactory;
import com.yyf.app.ch8.factory.OperationBasicFactory;

public class OperationFactory {

    public static Operation createOperation(String operationType) {
        IFactory factory;
        switch (operationType) {
            case "+":
            case "-":
            case "*":
            case "/":
                factory = new OperationBasicFactory();
                break;

            case "pow":
            case "log":
                factory = new OperationAdvancedFactory();
                break;
            default:
                throw new RuntimeException("算法不存在");
        }
        return factory.createOperation(operationType);
    }
}
