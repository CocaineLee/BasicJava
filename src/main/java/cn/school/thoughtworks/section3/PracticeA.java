package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result=new HashMap<String, Integer>();
        List<String> list=object.get("value");
        for(String key: collectionA.keySet())
        {
            Integer value=collectionA.get(key);
            if(list.contains(key))
                value--;
            result.put(key,value);
        }
        return result;
    }
}
