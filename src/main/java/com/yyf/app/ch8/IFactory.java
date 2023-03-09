package com.yyf.app.ch8;

/**
 * 创建工厂顶级类
 */
public interface IFactory {

    Operation createOperation(String operationType);
}
