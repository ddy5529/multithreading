package com.example.ddy.github.multithreading.thread.one;

import com.example.ddy.github.multithreading.NumStatic;

public class SonThread extends Thread {

    public SonThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < NumStatic.CYCLES_NUM; i++) {
            System.out.println(this.getName()+"|SonThread num:"+i);
        }
    }

}
