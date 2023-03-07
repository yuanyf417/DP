package com.yyf.app.ch0.impl;

import com.yyf.app.ch0.Bird;
import com.yyf.app.ch0.association.Climate;
import lombok.Data;

/**
 * 企鹅
 */
@Data
public class Penguin extends Bird {

    /**
     * 气候
     */
    private Climate climate;
}
