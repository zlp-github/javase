package com.demo1;

import java.io.*;

import java.util.Date;

public class TestSendWeekly {

    public static void main(String[] args) throws IOException {
        College slg = new College();         //学校对象
        Department dep =new Department();    //部门对象
        Student stu = new Student();         //学生对象
        DepartmentStudentRelationship dsr = new DepartmentStudentRelationship();  //部门学生关系对象

        slg.setCollId(121);
        slg.setCollName("陕理工");
        slg.setCollLocation("陕西省汉中市");

        dep.setDepId(1);
        dep.setDepName("文艺部");
        dep.setDepHeader("朱征宇");
        dep.setStuUnId(1);

        stu.setStuId(1602);
        stu.setStuName("张正娟");
        stu.setCollId(slg.getCollId());

        dsr.setId(1);
        dsr.setStuId(stu.getStuId());
        dsr.setDepId(dep.getDepId());
        String diary =stu.getStuName()+":陕理工是真的美！！！"+new Date();
        dsr.setDiary(diary);


        String filePath = "C:\\Users\\51967\\IdeaProjects\\javase\\day04\\src\\com\\a.txt";
        File file = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Writer out = new OutputStreamWriter(fileOutputStream);
        out.write(dsr.getDiary());
        out.close();

    }
}
