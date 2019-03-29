package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String > result=new ArrayList<>();
        for(String c1Str:collection1){
            for(List<String> c2Li:collection2)
                for(String c2Str: c2Li){
                    if(c1Str.equals(c2Str))
                        result.add(c1Str);
                }
        }
        return result;
    }
}
