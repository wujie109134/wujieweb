package costtest;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//测试集合api
public class TestArryList {
    @Test
    public  void TestArryList(){
       List list = new ArrayList();
       System.out.println(list.size());
       list.add("1");
       list.add("nihao");
       list.add("3");
       for (int i = 0;i<list.size();i++){
           System.out.println(list.get(i));
       }

    }
}
