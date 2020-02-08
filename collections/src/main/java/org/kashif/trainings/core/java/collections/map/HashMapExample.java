package org.kashif.trainings.core.java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public Map<Integer, String> getNumberMap() {
        return numberMap;
    }

    private Map<Integer, String> numberMap = new HashMap<Integer, String>(){
        {
            put(1, "One");
            put(2, "Two");
            put(3, "Three");
            put(4, "Four");
            put(5, "Five");
        }
    };

    public void mapForEach(){
        numberMap.forEach((key, value) ->{
            System.out.println("Key:"+ key+ ", Value:"+ value);
        });
    }

    public String mapCompute(int key, String newValue){
        return numberMap.compute(key, (k, v) -> v == null ? newValue : v);
    }

    public String mapComputeIfAbsent(int key, String newValue){
        return numberMap.computeIfAbsent(key, k -> newValue);
    }

    public String mapComputeIfPresent(int key, String newValue){
        return numberMap.computeIfPresent(key, (k, v) -> newValue);
    }

    public String mapMerge(int key, String newValue){
        return numberMap.merge(key, newValue, (k, v) -> newValue);
    }
}
