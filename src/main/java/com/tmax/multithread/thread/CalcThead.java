package com.tmax.multithread.thread;

public class CalcThead extends Thread{

    public CalcThead(String name){
        setName(name);
    }

    public void run(){
        for(int i=0;i<2000000000;i++){

        }
        System.out.println(getName());
    }
}
