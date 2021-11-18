package cost;

import java.sql.Date;

public class Cost {

    // 私有属性
    private int id;            //唯一表示
    private String name;       //自费名称
    private int baseDuration;  //基本费用
    private double unitCost;   //费用单位
    private String descr;      //资费描述
    private Date createTime;   //创建时间

    //构造方法
    public Cost() {
    }

    public Cost(int id, String name, int baseDuration, double unitCost, String descr, Date createTime) {
        this.id = id;
        this.name = name;
        this.baseDuration = baseDuration;
        this.unitCost = unitCost;
        this.descr = descr;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(int baseDuration) {
        this.baseDuration = baseDuration;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    // 覆盖tistring方法测试时观察对象属性
    // 返回对象的字符串表达
    @Override
    public String toString(){
        return "Id:"+id+",Name:"+name+",unitCost"+unitCost+",createTime"+createTime;
    }
}
