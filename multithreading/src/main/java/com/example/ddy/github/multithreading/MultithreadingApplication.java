package com.example.ddy.github.multithreading;

import com.example.ddy.github.multithreading.thread.one.SonThread;
import com.example.ddy.github.multithreading.thread.three.SonExecutorService;
import com.example.ddy.github.multithreading.thread.two.SonRunable;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultithreadingApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(MultithreadingApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        new SonThread("线程，第一次 ").start();
        new SonThread("线程，第二次 ").start();
        new SonThread("线程，第三次 ").start();
        new Thread(new SonRunable("Runnable，第一次 ")).start();
        new Thread(new SonRunable("Runnable，第二次 ")).start();
        new Thread(new SonRunable("Runnable，第三次 ")).start();
        new SonExecutorService("Callable，第一次").start();
        new SonExecutorService("Callable，第二次").start();
        new SonExecutorService("Callable，第三次").start();
    }
}
