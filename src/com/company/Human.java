package com.company;

/**
 * Created by java1 on 2017.12.11..
 */
public class Human implements iMove, iSleep {

    public void doMove(){
        System.out.println("Human running");
    }

    public void doSleep() {
        System.out.println("Human sleeping");
    }

}
