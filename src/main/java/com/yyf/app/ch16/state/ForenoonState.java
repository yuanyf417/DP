package com.yyf.app.ch16.state;

import com.yyf.app.ch16.State;
import com.yyf.app.ch16.Work;

/**
 * 上午
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间" + work.getHour() + "上午工作，精神百倍啊");
        } else {
            work.setCurrentState(new NoonState());
            work.writeProgram();
        }
    }
}
