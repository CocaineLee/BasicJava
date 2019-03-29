package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collectionB=new HashMap<String, Integer>();
        for(String key: collectionA)
        {
            if(!collectionB.containsKey(key)) {
                if(key.length()!=1)
                {
                    String[] kNv=key.split("-");
                    collectionB.put(kNv[0],Integer.parseInt(kNv[1]));
                }
                else {
                    collectionB.put(key, 0);
                    for (String index : collectionA) {
                        if (key.equals(index))
                            collectionB.put(key, collectionB.get(key) + 1);
                    }
                }
            }
        }
        Map<String,Integer> result=new HashMap<String, Integer>();
        List<String> list=object.get("value");
        for(String key: collectionB.keySet())
        {
            Integer value=collectionB.get(key);
            if(list.contains(key)){
                value=value-value/3;
            }
            result.put(key,value);
        }
        return result;
    }
}
