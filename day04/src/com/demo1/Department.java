package com.demo1;

public class Department {
    private int depId;           //部门编号
    private String depName;      //部门名称
    private String depHeader;    //部门负责人
    private String depIntroduction; //部门介绍
    private int stuUnId;         //学生会id

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepHeader() {
        return depHeader;
    }

    public void setDepHeader(String depHeader) {
        this.depHeader = depHeader;
    }

    public String getDepIntroduction() {
        return depIntroduction;
    }

    public void setDepIntroduction(String depIntroduction) {
        this.depIntroduction = depIntroduction;
    }

    public int getStuUnId() {
        return stuUnId;
    }

    public void setStuUnId(int stuUnId) {
        this.stuUnId = stuUnId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                ", depHeader='" + depHeader + '\'' +
                ", depIntroduction='" + depIntroduction + '\'' +
                ", stuUnId=" + stuUnId +
                '}';
    }
}
