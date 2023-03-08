package com.yyf.app.ch6;

/**
 * 具体的对象
 * 也可以给这个对象添加职责
 * @author YYF.
 * date 2023/3/8 22:59.
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("具体对象的实际操作");
    }
}
