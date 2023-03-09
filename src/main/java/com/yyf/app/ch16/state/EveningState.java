package com.yyf.app.ch16.state;

import com.yyf.app.ch16.State;
import com.yyf.app.ch16.Work;

/**
 * 晚上
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isWorkFinish()) {
            work.setCurrentState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println(work.getHour() + "ca 加班搞");
            } else {
                work.setCurrentState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
