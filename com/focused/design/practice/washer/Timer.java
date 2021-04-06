package com.focused.design.practice.washer;

public class Timer {

    public boolean startTimer() throws Exception{
        System.out.println("Started the timer");

        Thread.sleep(40000);

        endTimer();
        return true;
    }

    public void endTimer() {
        System.out.println("timer expired");
    }

}
