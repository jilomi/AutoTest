package com.course.testng;

import org.testng.annotations.Test;


public class ExpectedException {



//    这是一个测试结果会失败的异常
@Test(expectedExceptions = RuntimeException.class )
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }



//    这是一个成功的异常
    @Test(expectedExceptions = RuntimeException.class)
public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();

}
}
