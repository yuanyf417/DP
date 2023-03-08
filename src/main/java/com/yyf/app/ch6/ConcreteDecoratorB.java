package com.yyf.app.ch6;

/**
 * 具体装饰对象B
 * @author YYF.
 * date 2023/3/8 23:04.
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    /**
     * 具体装饰对象B的独有函数
     */
    private void addedBehavior() {
        System.out.println("具体装饰对象B的独有操作");
    }
}
