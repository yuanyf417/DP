package com.yyf.app.ch16;

import com.yyf.app.ch16.state.ForenoonState;

/**
 * 工作类
 */
public class Work {

    /**
     * 当前状态
     */
    private State currentState;

    /**
     * 当前时间
     */
    private int hour;

    /**
     * 工作是否完成
     */
    private boolean workFinish;

    public Work() {
        this.currentState = new ForenoonState();
    }

    public void writeProgram() {
        this.currentState.writeProgram(this);
    }

    public boolean isWorkFinish() {
        return workFinish;
    }

    public void setWorkFinish(boolean workFinish) {
        this.workFinish = workFinish;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
