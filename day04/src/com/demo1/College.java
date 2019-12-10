package com.demo1;

public class College {
    private String collName;  //学校名
    private int collId;       //学校编号
    private String collLocation;  //学校地址

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

    public int getCollId() {
        return collId;
    }

    public void setCollId(int collId) {
        this.collId = collId;
    }

    public String getCollLocation() {
        return collLocation;
    }

    public void setCollLocation(String collLocation) {
        this.collLocation = collLocation;
    }

    @Override
    public String toString() {
        return "College{" +
                "collName='" + collName + '\'' +
                ", collId=" + collId +
                ", collLocation='" + collLocation + '\'' +
                '}';
    }
}
