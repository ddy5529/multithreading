package com.example.ddy.github.multithreading.thread.two;

import com.example.ddy.github.multithreading.NumStatic;

public class SonRunable implements Runnable {

    private String name;

    public SonRunable(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0; i < NumStatic.CYCLES_NUM; i++) {
            System.out.println("SonRunable num:"+i);
        }
    }

}
