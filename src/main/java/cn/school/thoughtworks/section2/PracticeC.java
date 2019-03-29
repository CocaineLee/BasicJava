package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result=new HashMap<String, Integer>();
        for(String key: collection1)
        {
            if(!result.containsKey(key)) {
                result.put(key, 0);
                if(key.length()!=1)
                {
                    String[] kNv=key.split("-");
                    if(kNv.length!=2){
                        kNv =key.split(":");
                        if(kNv.length!=2){
                            kNv =key.split("[");
                            kNv[1]=kNv[1].split("]")[0];
                        }
                    }
                    result.put(kNv[0],Integer.parseInt(kNv[1]+result.get(kNv[0])));
                }
                else {

                    for (String index : collection1) {
                        if (key.equals(index))
                            result.put(key, result.get(key) + 1);
                    }
                }
            }
        }
        return result;
    }
}
