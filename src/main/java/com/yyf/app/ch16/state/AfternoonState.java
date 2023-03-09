package com.yyf.app.ch16.state;

import com.yyf.app.ch16.State;
import com.yyf.app.ch16.Work;

/**
 * 下午
 */
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println(work.getHour() + "下午状态还行");
        } else {
            work.setCurrentState(new EveningState());
            work.writeProgram();
        }
    }
}
