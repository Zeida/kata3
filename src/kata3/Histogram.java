package kata3;

import java.util.*;

public class Histogram<T> {

    Map<T, Integer> map = new HashMap<>();

    public Integer get(T key){
        return map.get(key);
    }

    public Set<T> keySet(){
        return map.keySet();
    }

    public void increment(T key){
        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
}