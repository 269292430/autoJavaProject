package com.auto.meyang.zhulong.jdbc;

public class RyzzEntity {
    private  String  staffid;
    private  String  typename;
    private  String  typeid;
    private  String  parenttypeid;
    private  String  isdeleted;

    public RyzzEntity(){
    }

    public RyzzEntity(String staffid, String typename, String typeid, String parenttypeid, String isdeleted) {
        this.staffid = staffid;
        this.typename = typename;
        this.typeid = typeid;
        this.parenttypeid = parenttypeid;
        this.isdeleted = isdeleted;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getParenttypeid() {
        return parenttypeid;
    }

    public void setParenttypeid(String parenttypeid) {
        this.parenttypeid = parenttypeid;
    }

    public String getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(String isdeleted) {
        this.isdeleted = isdeleted;
    }

    @Override
    public String toString() {
        return "RyzzEntity{" +
                "staffid='" + staffid + '\'' +
                ", typename='" + typename + '\'' +
                ", typeid='" + typeid + '\'' +
                ", parenttypeid='" + parenttypeid + '\'' +
                ", isdeleted='" + isdeleted + '\'' +
                '}';
    }
}
