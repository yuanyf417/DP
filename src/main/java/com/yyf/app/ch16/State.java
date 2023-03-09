package com.yyf.app.ch16;

/**
 * 状态抽象类
 */
public abstract class State {

    /**
     * 状态变化点
     * @param work
     */
    public abstract void writeProgram(Work work);
}
