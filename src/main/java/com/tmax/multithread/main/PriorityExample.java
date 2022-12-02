package com.tmax.multithread.main;

import com.tmax.multithread.thread.CalcThead;

public class PriorityExample {
    public static void main(String[] args) {

        for(int i=1;i<=20;i++){
            Thread thread= new CalcThead("thread"+i);
            if(i!=10){
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            else
                thread.setPriority(Thread.MAX_PRIORITY);

            thread.start();
        }
    }
}
