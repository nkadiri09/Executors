package com.nare.kadiri.First;

import java.util.concurrent.TimeUnit;

public class FirstTechnique {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        new FirstTask();
        Thread t = new FirstTask();



        System.out.println("Main Thread Ended");
    }
}

class FirstTask extends Thread{
    private static int count = 0;
    private int id;

    public void run(){
        for(int i=10;i>0;i--){
            System.out.println("<"+id+"> TICK TICK - "+i);
            try{
                TimeUnit.MICROSECONDS.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public FirstTask(){
        this.id=++count;
        this.start();
    }
}
