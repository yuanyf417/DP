package com.yyf.app.ch16.state;

import com.yyf.app.ch16.State;
import com.yyf.app.ch16.Work;

/**
 * 寄了
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(work.getHour() + "睡了 zzZZ");
    }
}
