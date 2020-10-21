package com.zhulong.jdbc.test;

import com.auto.meyang.zhulong.jdbc.DBHelper;
import org.testng.annotations.Test;

public class DBHelperTest {

    @Test
    public  void   qurayTest(){
        DBHelper op= new DBHelper();
        op.search("select   *   from   sys_user  r   where  r.user_account='18589063868'",null);
    }


}
