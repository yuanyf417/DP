package com.yyf.app.ch0.impl;

import com.yyf.app.ch0.interfaces.ILanguage;
import lombok.Data;

/**
 * 唐老鸭
 */
@Data
public class DonaldDuck extends Duck implements ILanguage {

    /**
     * 说人话
     */
    @Override
    public void speak() {
        System.out.println("说人话");
    }
}
