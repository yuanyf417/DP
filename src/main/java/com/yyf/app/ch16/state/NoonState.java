package com.yyf.app.ch16.state;

import com.yyf.app.ch16.State;
import com.yyf.app.ch16.Work;

/**
 * 中午
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(work.getHour() + "午饭");
        } else {
          work.setCurrentState(new AfternoonState());
          work.writeProgram();
        }
    }
}
