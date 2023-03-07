package com.yyf.app.ch0.impl;

import com.yyf.app.ch0.Bird;
import com.yyf.app.ch0.interfaces.IFly;
import lombok.Data;

/**
 * 大雁
 */
@Data
public class WideGoose extends Bird implements IFly {

    /**
     * 飞翔
     */
    @Override
    public void fly() {
        System.out.println("飞翔");
    }
}
