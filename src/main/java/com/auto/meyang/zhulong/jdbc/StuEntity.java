package com.auto.meyang.zhulong.jdbc;

public class StuEntity {
    private  String id;
    private String  name;
    private  String sex;
    private  String num;

    public  StuEntity(){
    }

    public StuEntity(String id, String name, String sex, String num) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.num = num;
    }

    @Override
    public String toString() {
        return "StuEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", num=" + num +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
