package com.course.testng.group;

import org.testng.annotations.Test;

import java.security.acl.Group;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1的stu2运行");
    }
}
