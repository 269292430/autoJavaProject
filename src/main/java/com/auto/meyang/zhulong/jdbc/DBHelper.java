package com.auto.meyang.zhulong.jdbc;


import java.sql.*;

public class DBHelper {
    //postgresql
    String postgreDriver = "org.postgresql.Driver";
    String urlPostgre = "jdbc:postgresql://192.168.169.108:5432/biaost";
    String userPostgre = "zl_reader";
    String pwdPostgre = "zl_reader";

    String postgreDriver1 = "org.postgresql.Driver";
    String urlPostgre1 = "jdbc:postgresql://192.168.169.111:5432/biaost";
    String userPostgre1 = "developer";
    String pwdPostgre1 = "developer";


    String urlPostgre2 = "jdbc:postgresql://192.168.169.89:5432/zljianzhu";
    String userPostgre2 = "developer";
    String pwdPostgre2 = "developer";

    //oracle
    String   oracleDriver ="oracle.jdbc.OracleDriver";
    String  oracleUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String  oracleUser= "scott";
    String  oraclePwd= "tiger";

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet res = null;

    /**
     * 获取本地数据库连接  192.168.169.89
     */
    public void dbConnect() {
        try {
            //1.加载postgresql驱动
            Class.forName(postgreDriver1);
            //2.获得数据库连接
            con = DriverManager.getConnection(urlPostgre2, userPostgre2, pwdPostgre2);
        } catch (ClassNotFoundException e) {
            System.err.println("装载 JDBC/ODBC 驱动程序失败。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("无法连接数据库");
            e.printStackTrace();
        }

    }

/*

    */
/**
     * 获取本地数据库连接  192.168.169.89
     *//*

    public void dbConnect() {
        try {
            //1.加载postgresql驱动
            Class.forName(postgreDriver1);
            //2.获得数据库连接
            con = DriverManager.getConnection(urlPostgre1, userPostgre1, pwdPostgre1);
        } catch (ClassNotFoundException e) {
            System.err.println("装载 JDBC/ODBC 驱动程序失败。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("无法连接数据库");
            e.printStackTrace();
        }

    }
*/




    /* *//**
     * 获取测试环境数据库连接
     *//*
    public void dbConnect() {
        try {
            //1.加载postgresql驱动
            Class.forName(postgreDriver);
            //2.获得数据库连接
            con = DriverManager.getConnection(urlPostgre, userPostgre, pwdPostgre);
        } catch (ClassNotFoundException e) {
            System.err.println("装载 JDBC/ODBC 驱动程序失败。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("无法连接数据库");
            e.printStackTrace();
        }

    }*/


    //查询
    public ResultSet search(String sql, String str[]) {
        //连接数据库
        dbConnect();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            if (str != null) {
                for (int i = 0; i < str.length; i++) {
                    pst.setString(i + 1, str[i]);
                }
            }
            //执行SQL语句
            res = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    //曾删改
    public int addU(String sql, String str[]) {
        int a = 0;
        //连接数据库
        dbConnect();
        System.out.println("str.length  "+str.length);
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            if (str != null) {
                for (int i = 0; i < str.length; i++) {
                   pst.setString(i + 1, str[i]);
                }
            }
            a = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

/*
    create  table  stuhjhtest(
            id varchar(255),
            name varchar(255),
    sex  varchar(255),
    num  varchar(255)
);

create  table  hjhtest_ry(
staffid   varchar(255),
typename  varchar(255),
typeid    varchar(255),
parenttype_id  varchar(255),
isdeleted    varchar(255)
);


create  table  hjhtest_ry2(
htmlkey   varchar(255),
xmjl  varchar(255),
zbr    varchar(255),
ggmeta  varchar(255),
qyzcry    varchar(255),
gg    varchar(255),
gghtml    varchar(255)
);






    */


}