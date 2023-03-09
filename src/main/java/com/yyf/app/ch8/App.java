package com.yyf.app.ch8;

import com.yyf.app.ch8.factory.OperationAdvancedFactory;
import com.yyf.app.ch8.factory.OperationBasicFactory;

public class App {

    public static void main(String[] args) {
//        OperationBasicFactory operationBasicFactory = new OperationBasicFactory();
//        Operation operation = operationBasicFactory.createOperation("/");
//        double v = operation.gerResult(2D, 3D);
//        System.out.println(v);
//
//        OperationAdvancedFactory operationAdvancedFactory = new OperationAdvancedFactory();
//        Operation operation1 = operationAdvancedFactory.createOperation("log");
//        double v1 = operation1.gerResult(10D, 3D);
//        System.out.println(v1);


        Operation log = OperationFactory.createOperation("+");
        double v2 = log.gerResult(10D, 3D);
        System.out.println(v2);
    }
}
