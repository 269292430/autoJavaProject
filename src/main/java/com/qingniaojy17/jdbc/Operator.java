package com.qingniaojy17.jdbc;

import java.sql.*;

public class Operator {
    //mysql
    String  sqlConnctString = "jdbc:mysql://localhost:3306/newsmanagersystem?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";
    String  dbUser= "root";
    String  dbPwd= "123456";

    //oracle
    String  oracleConnctString = "jdbc:oracle:thin:@localhost:1521:orcl";
    String  oracleUser= "scott";
    String  oraclePwd= "tiger";


    public  void  executeUpdate(){
        //1.加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con =null;
        Statement stmt = null;

        try {
            //2.建立连接
            con = DriverManager.getConnection(sqlConnctString,dbUser,dbPwd);
            stmt = con.createStatement();
            int count = stmt.executeUpdate("insert  into  topic(topicName)  values('哈哈3')");
            // int count = stmt.executeUpdate("update  topic(topicName)  values('哈哈')");
            if(count > 0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(null != stmt){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(null != con){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * oracle数据库处理
     */
    public   void   executQuery(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Connection  con= null;
        Statement    stmt= null;
        ResultSet rs= null;

        try {
            con=DriverManager.getConnection(oracleConnctString,oracleUser,oraclePwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select  *   from  emp");
            //rs.next();
            //System.out.println(rs.getInt(1)+"\t"+rs.getInt(2));

            while (rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(null !=rs){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(null !=stmt){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(null !=con){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }





}
