package com.yyf.app.ch6;

/**
 * 装饰抽象类
 * 对应Component无需知道本类的存在
 * @author YYF.
 * date 2023/3/8 23:01.
 */
public abstract class Decorator extends Component{

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写 实际调用Component的operation
     */
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
