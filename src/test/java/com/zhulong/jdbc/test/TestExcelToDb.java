package com.zhulong.jdbc.test;

import com.auto.meyang.zhulong.jdbc.*;
import org.testng.annotations.Test;

import java.util.List;

public class TestExcelToDb {
    @Test
    public  void  excelToDbTest() {
        //得到xls格式表格中所有的数据
        List<StuEntity> listExcel = StuService.getAllByExcel("E:/hujinhua/test/student.xls");
        DBHelper db = new DBHelper();
        for(int i=0;i<listExcel.size();i++){
            String sql = "insert   into  stuhjhtest(id,name,sex,num) values(?,?,?,?)";
            String[] str = new String[]{listExcel.get(i).getId(),listExcel.get(i).getName(), listExcel.get(i).getSex(), listExcel.get(i).getNum()};
            db.addU(sql, str);
        }
    }

    @Test
    public  void  excelToDbTest2() {
        //得到xlsx格式表格中所有的数据
        List<StuEntity> listExcel = StuService.getAllByExcel2("E:/hujinhua/test/s.xlsx");
        DBHelper db = new DBHelper();
        for(int i=0;i<listExcel.size();i++){
            String sql = "insert   into  stuhjhtest(id,name,sex,num) values(?,?,?,?)";
            String[] str = new String[]{listExcel.get(i).getId(),listExcel.get(i).getName(), listExcel.get(i).getSex(), listExcel.get(i).getNum()};
            db.addU(sql, str);
        }
    }

    @Test
    public  void  excelToDbTestBiaoShiTongRyzz() {
        //得到xlsx格式表格中所有的数据
        List<RyzzEntity> listExcel = StuService.getAllByExcel21("E:/bstryzz.xlsx");
        DBHelper db = new DBHelper();
        for(int i=0;i<listExcel.size();i++){
            String sql = "insert   into  hjhtest_ry(staffid,typename,typeid,parenttype_id,isdeleted) values(?,?,?,?,?)";
            String[] str = new String[]{listExcel.get(i).getStaffid(),listExcel.get(i).getTypename(), listExcel.get(i).getTypeid(), listExcel.get(i).getParenttypeid(),listExcel.get(i).getIsdeleted()};
            db.addU(sql, str);
        }
    }

    @Test
    public  void  excelToDbTestBstry() {
        //得到xlsx格式表格中所有的数据
        List<RyzzEntity2> listExcel = StuService.getAllByExcel22("E:/bstryzz2.xlsx");
        DBHelper db = new DBHelper();
        for(int i=0;i<listExcel.size();i++){
            String sql = "insert   into  hjhtest_ry2(htmlkey,xmjl,zbr,ggmeta,qyzcry,gg,gghtml) values(?,?,?,?,?,?,?)";
            String[] str = new String[]{listExcel.get(i).getHtmlkey(),listExcel.get(i).getXmjl(), listExcel.get(i).getZbr(), listExcel.get(i).getGgmeta(),listExcel.get(i).getQyzcry(),listExcel.get(i).getGg(),listExcel.get(i).getGghtml()};
            db.addU(sql, str);
        }
    }



}
