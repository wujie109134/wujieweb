package costtest;

import cost.Cost;
import org.junit.Test;

import java.sql.Date;

public class TestCost {
    @Test
    public void test(){
        Cost c1 = new Cost();
        c1.setId(1);
        c1.setName("包二十小时");
        c1.setBaseDuration(20);
        c1.setUnitCost(24.5);
        c1.setUnitCost(0.01);
        c1.setDescr("包二十小时");
        //将string日期转化为sql里的时间数据
        Date d1 = Date.valueOf("2021-01-01");
        c1.setCreateTime(d1);
        System.out.println(c1);

    }
}
