package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result=new HashMap<String, Integer>();
        for(String key: collection1)
        {
            if(!result.containsKey(key)){
                result.put(key,0);
                for(String index:collection1)
                {
                    if(key.equals(index))
                        result.put(key,result.get(key)+1);
                }
            }
        }
        return result;
    }
}
