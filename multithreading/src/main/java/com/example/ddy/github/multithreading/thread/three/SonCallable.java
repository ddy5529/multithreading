package com.example.ddy.github.multithreading.thread.three;

import com.example.ddy.github.multithreading.NumStatic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class SonCallable implements Callable<Map<String,Object>> {

    private String name;

    public SonCallable(String name) {
        this.name = name;
    }

    @Override
    public Map<String, Object> call() throws Exception {
        Map<String, Object> newMap=new HashMap<>();
        newMap.put("code",200);
        newMap.put("resule","OK");
        newMap.put("name",this.name);
        return newMap;
    }
}
