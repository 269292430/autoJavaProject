package com.auto.meyang.zhulong.jdbc;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING;

public class StuService {

    /**
     * 查询stu表中所有的数据
     */
    public  static List<StuEntity> getAllByDb() {
        List<StuEntity> list = new ArrayList<StuEntity>();
        try {
            DBHelper db = new DBHelper();
            String sql = "select  *   from  stuhjhtest";
            ResultSet rs = db.search(sql, null);
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String num = rs.getString("num");

                list.add(new StuEntity(id,name,sex,num));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 查询指定目录中xlsx格式的电子表格中所有的数据
     * @param filePath 文件完整路径
     * @return
     */
    public static List<StuEntity> getAllByExcel2(String filePath){
        List<StuEntity> stuEntityList=new ArrayList<StuEntity>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(filePath);//得到工作薄
            XSSFSheet sheet = workbook.getSheetAt(0);//得到工作薄中第一个工作表
            int rows =sheet.getPhysicalNumberOfRows();//得到有效行数
            for (int i = 1; i < rows; i++) {
                XSSFRow row = sheet.getRow(i);//得到一行数据
                int clos = row.getPhysicalNumberOfCells();//得到有效列数
                List<String>  list = new ArrayList<String>();
                for (int j = 0; j < clos; j++) {
                    XSSFCell cell = row.getCell(j);//得到列
                    //把每列格式都设置成字符串格式
                    cell.setCellType(CELL_TYPE_STRING);
                    String  vlaue = cell.getStringCellValue();
                    list.add(vlaue);
                }
                stuEntityList.add(new StuEntity(list.get(0),list.get(1),list.get(2),list.get(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stuEntityList;
    }



    /**
     * 查询指定目录中xlsx格式的电子表格中所有的数据
     * @param filePath 文件完整路径
     * @return
     */
    public static List<RyzzEntity> getAllByExcel21(String filePath){
        List<RyzzEntity> ryzzEntityList=new ArrayList<RyzzEntity>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(filePath);//得到工作薄
            XSSFSheet sheet = workbook.getSheetAt(0);//得到工作薄中第一个工作表
            int rows =sheet.getPhysicalNumberOfRows();//得到有效行数
            System.out.println("rows="+rows);
            for (int i = 1; i < rows; i++) {
                XSSFRow row = sheet.getRow(i);//得到一行数据
                int clos = row.getPhysicalNumberOfCells();//得到有效列数
                System.out.println("clos="+clos);
                List<String>  list = new ArrayList<String>();
                for (int j = 0; j < clos; j++) {
                    XSSFCell cell = row.getCell(j);//得到列
                    //把每列格式都设置成字符串格式
                    cell.setCellType(CELL_TYPE_STRING);
                    String  vlaue = cell.getStringCellValue();
                    list.add(vlaue);
                }
                System.out.println("list="+list);
                ryzzEntityList.add(new RyzzEntity(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ryzzEntityList;
    }

    /**
     * 查询指定目录中xlsx格式的电子表格中所有的数据
     * @param filePath 文件完整路径
     * @return
     */
    public static List<RyzzEntity2> getAllByExcel22(String filePath){
        List<RyzzEntity2> ryzzEntityList= new ArrayList<RyzzEntity2>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(filePath);//得到工作薄
            XSSFSheet sheet = workbook.getSheetAt(0);//得到工作薄中第一个工作表
            int rows =sheet.getPhysicalNumberOfRows();//得到有效行数
            System.out.println("rows="+rows);
            for (int i = 1; i < rows; i++) {
                XSSFRow row = sheet.getRow(i);//得到一行数据
                int clos = row.getPhysicalNumberOfCells();//得到有效列数
                System.out.println("clos="+clos);
                List<String>  list = new ArrayList<String>();
                for (int j = 0; j < clos; j++) {
                    XSSFCell cell = row.getCell(j);//得到列
                    //把每列格式都设置成字符串格式
                    cell.setCellType(CELL_TYPE_STRING);
                    String  vlaue = cell.getStringCellValue();
                    list.add(vlaue);
                }
                System.out.println("list="+list);
                ryzzEntityList.add(new RyzzEntity2(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),list.get(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ryzzEntityList;
    }



    /**
     * 查询指定目录中xls格式电子表格中的所有数据
     */
    public  static  List<StuEntity> getAllByExcel(String  filePath){
        List<StuEntity>  stuEntityList = new ArrayList<StuEntity>();
        try {
            //读取excel
            InputStream inPath = new FileInputStream(filePath);
            //解析工作薄
            HSSFWorkbook  workbook = new HSSFWorkbook(inPath);
            //解析工作表
            int   sheetCount = workbook.getNumberOfSheets();
            //循环处理读取每个工作表中的数据
            for(int  i=0;i<sheetCount;i++){
                //拿到一个具体的工作表
                HSSFSheet  sheet = workbook.getSheetAt(i);
                //得到有效的总行数
                int  rowNumber = sheet.getPhysicalNumberOfRows();
                //得到除去第一行外整个Excel中所有有效的数据
                for(int rowIndex=1;rowIndex<rowNumber;rowIndex++){
                    //得到一行数据
                    HSSFRow  row = sheet.getRow(rowIndex);
                    //得到获取行的总列数
                    int  cellNumber = row.getPhysicalNumberOfCells();
                    List<String>  list = new ArrayList<String>();
                    //把得到一行数据添加到list中去
                    for(int cellIndex=0;cellIndex<cellNumber;cellIndex++){
                        HSSFCell  cell = row.getCell(cellIndex);
                        //把每列格式都设置成字符串格式
                        cell.setCellType(CELL_TYPE_STRING);
                        //得到单元格值
                        String  value =cell.getStringCellValue();
                        list.add(value);
                    }
                    //添加一行数据到stuEntityList
                    if(list.size() >0){
                        stuEntityList.add(new StuEntity(list.get(0),list.get(1),list.get(2),list.get(3)));
                    }
                }
            }

        }catch (FileNotFoundException e){
            e.fillInStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return stuEntityList;
    }

    /**
     * 读取相应目录下所有的Excel
     */
    public   static  List<File>  getFileList(String   strPath){
        List<File>  filesList = new ArrayList<File>();

        File  dir = new File(strPath);
        File[]  files = dir.listFiles();//该目录下文件全部放入数组
        if(files != null){

            for (int i = 0; i < files.length; i++) {
                String  fileName = files[i].getName();

                if(files[i].isDirectory()){    //判断是文件还是文件夹
                   // getFileList(files[i].getAbsolutePath()); //获取绝对路径
                }else if(fileName.endsWith(".xlsx")){
                    filesList.add(files[i]);
                }else if(fileName.endsWith(".xls")){
                    filesList.add(files[i]);
                }else {
                    continue;
                }

            }

        }

        System.out.println(filesList);
          return  filesList;
    }




    /**
     * 通过ID判断是否存在
     */
    public  static boolean  isExist(int  id){

        DBHelper   db = new DBHelper();
        ResultSet rs = db.search("select  *   from   stuhjhtest  where  id=?",new String[]{id+""});

        try {
            if(rs.next()){
                System.out.println(rs.getInt("id")+"\t"+rs.getString("name"));
                return  true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;
    }








}
