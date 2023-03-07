package com.yyf.app.ch0.aggregation;

import com.yyf.app.ch0.impl.WideGoose;
import lombok.Data;

@Data
/**
 * 雁群
 */
public class WideGooseAggregate {

    /**
     * 大雁数组组成雁群
     */
    private WideGoose[] wideGooses;

    /**
     * V字飞行
     */
    public void vFlight() {
        System.out.println("V字飞行");
    }

    /**
     * 一字飞行
     */
    public void oneLineFlight() {
        System.out.println("一字飞行");
    }
}
