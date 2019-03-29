package cn.school.thoughtworks.section2;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result=new HashMap<String, Integer>();
        for(String key: collection1)
        {
            if(key.length()!=1){
                String keys;
                Integer value;
                String[] keyNValue;
                if(key.contains("-")){
                    keyNValue=key.split("-");
                    keys=keyNValue[0];
                    value=Integer.parseInt(keyNValue[1]);
                }
                else if(key.contains(":")){
                    keyNValue=key.split(":");
                    keys=keyNValue[0];
                    value=Integer.parseInt(keyNValue[1]);
                }
                else{
                    keyNValue=key.split("\\[");
                    keys=keyNValue[0];
                    value=Integer.parseInt(keyNValue[1].split("]")[0]);
                }
                if(result.containsKey(keys)) value+=result.get(keys);
                result.put(keys,value);
            }
            else{
                if(!result.containsKey(key)) {
                    result.put(key, 1);
                }
                else
                    result.put(key,result.get(key)+1);
            }

        }
        return result;
    }
}
