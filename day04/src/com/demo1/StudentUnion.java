package com.demo1;

public class StudentUnion{
    private int stuUnId;           //学生会编号
    private String stuUnGrade;     //级别
    private int collageID;         //属于哪个学校

    public int getStuUnId() {
        return stuUnId;
    }

    public void setStuUnId(int stuUnId) {
        this.stuUnId = stuUnId;
    }

    public String getStuUnGrade() {
        return stuUnGrade;
    }

    public void setStuUnGrade(String stuUnGrade) {
        this.stuUnGrade = stuUnGrade;
    }

    public int getCollageID() {
        return collageID;
    }

    public void setCollageID(int collageID) {
        this.collageID = collageID;
    }

    @Override
    public String toString() {
        return "StudentUnion{" +
                "stuUnId=" + stuUnId +
                ", stuUnGrade='" + stuUnGrade + '\'' +
                ", collageID=" + collageID +
                '}';
    }

}
