package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result=new ArrayList<>();
        for(String c1:collection1){
            for(String c2:collection2){
                if(c1.equals(c2))
                    result.add(c1);
            }
        }
        return  result;
    }
}
