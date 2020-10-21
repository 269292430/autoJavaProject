package com.auto.meyang.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {
    //校验  a==a
    @Test
    public  void  assertEqualTest(){
        String  a =  "a";
        String b = "b";

       /* if(a.equals(b)){
            System.out.println("正确");
        }else {
            System.out.println("失败");
        }*/

       //a是实际值，b是预期值；这个失败了下面的代码就不会被执行了
        Assert.assertEquals(a,b,"a不等于b");
        Assert.assertEquals(a,b);
    }

    @Test
    public  void  assertNotEqualTest(){
        int a = 1;
        int b = 1;
        Assert.assertNotEquals(a,b);
    }

    @Test
    public  void  asserNullTest(){
        String  a = "";
        Assert.assertNull(a);
    }

    @Test
    public  void  asserNotNullTest() throws InterruptedException {
        Thread.sleep(3000);
        String  a = null;
        Assert.assertNotNull(a);
    }

    @Test
    public  void  asserFalse() throws InterruptedException {
        Thread.sleep(3000);
        Boolean  a = false;
        Assert.assertFalse(a);
    }

}
