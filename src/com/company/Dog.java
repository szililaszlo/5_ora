package com.company;

/**
 * Created by java1 on 2017.12.11..
 */
public class Dog implements iSleep, iMove {

    public void doMove(){
        System.out.println("Dog running");
    }

    public void doSleep() {
        System.out.println("Dog sleeping");
    }
}
