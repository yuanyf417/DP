package com.yyf.app.ch16.state;

import com.yyf.app.ch16.State;
import com.yyf.app.ch16.Work;

/**
 * 下班
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(work.getHour() + "下班了 哈哈哈哈");
    }
}
