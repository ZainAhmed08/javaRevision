package com.coreJava.multithreading;

public class MultithreadThing extends Thread{
    private int ThreadNumber;
    public int getThreadNumber(){
        return ThreadNumber;
    }
    public MultithreadThing(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;
    }
    @Override
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(i+" from ThreadNumber : "+ getThreadNumber());
            if(getThreadNumber() == 3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}