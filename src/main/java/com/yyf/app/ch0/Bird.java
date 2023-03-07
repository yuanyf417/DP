package com.yyf.app.ch0;

import com.yyf.app.ch0.composition.Wing;
import lombok.Data;

/**
 * 鸟
 */
@Data
public abstract class Bird extends Animal {

    /**
     * 羽毛
     */
    private String plumage;

    /**
     * 角质喙
     */
    private String hornyBeak;

    private Wing wing;


    public Bird() {
        this.wing = new Wing();
    }

    /**
     * 繁殖手段
     */
    @Override
    public void reproduction() {
        System.out.println("鸟会下蛋繁殖");
    }
}
