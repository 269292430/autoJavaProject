package com.zhulong.jdbc.test;

import com.auto.meyang.zhulong.jdbc.StuEntity;
import com.auto.meyang.zhulong.jdbc.StuService;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class TestDbToExcel {

    @Test
    public   void    dbToExcelTest() throws IOException {
        //得到数据库表中所有数据
        List<StuEntity>  list = StuService.getAllByDb();
        System.out.println(list);

        //1.创建工作薄
        XSSFWorkbook    workbook= new  XSSFWorkbook();
        //2.创建工作表
        XSSFSheet   sheet = workbook.createSheet("学生");

        //3.创建行
        XSSFRow   row = sheet.createRow(0);
        row.createCell(0).setCellValue("学号");
        row.createCell(1).setCellValue("姓名");
        row.createCell(2).setCellValue("性别");
        row.createCell(3).setCellValue("薪水");

        for (int i = 0; i < list.size(); i++) {
            XSSFRow row1 = sheet.createRow(i+1);
            row1.createCell(0).setCellValue(list.get(i).getId());
            row1.createCell(1).setCellValue(list.get(i).getName());
            row1.createCell(2).setCellValue(list.get(i).getSex());
            row1.createCell(3).setCellValue(list.get(i).getNum());
        }
        FileOutputStream  out = new FileOutputStream("E:/hujinhua/test/aaaaa.xlsx");
        workbook.write(out);

        out.flush();
        out.close();
        workbook.close();
    }


    @Test
    public  void   fileListTest(){
        List<File>  filesList = StuService.getFileList("E:/a");
    }




}
