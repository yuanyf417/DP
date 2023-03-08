package com.yyf.app.ch6;

/**
 * 具体装饰对象A
 * @author YYF.
 * date 2023/3/8 23:04.
 */
public class ConcreteDecoratorA extends Decorator{

    private String addedState;
    @Override
    public void operation() {
        super.operation();
        this.addedState = "具体装饰对象A的独有操作";
        System.out.println(addedState);
    }
}
