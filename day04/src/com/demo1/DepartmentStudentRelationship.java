package com.demo1;

public class DepartmentStudentRelationship {
    private int id;
    private int stuId;   //学生id
    private int depId;    //部门id
    private String diary; //日记

    public String getDiary() {
        return diary;
    }

    public void setDiary(String diary) {
        this.diary = diary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    @Override
    public String toString() {
        return "DepartmentStudentRelationship{" +
                "id=" + id +
                ", stuId=" + stuId +
                ", depId=" + depId +
                ", diary='" + diary + '\'' +
                '}';
    }
}
