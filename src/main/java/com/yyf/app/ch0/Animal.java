package com.yyf.app.ch0;

import com.yyf.app.ch0.depend.Oxygen;
import com.yyf.app.ch0.depend.Water;
import lombok.Data;

/**
 * 动物父类
 *
 */
@Data
public abstract class Animal {

    /**
     * 动物的属性（字段）
     */
    protected boolean life;

    /**
     * 新陈代谢
     * @param oxygen
     * @param water
     */
    public void Metabolism(Oxygen oxygen, Water water) {

        this.life = oxygen != null;
        // "活着的生命需要" + oxygen.getName() + "和" + water.getName();
    }

    /**
     * 繁殖
     */
    public abstract void reproduction();
}
