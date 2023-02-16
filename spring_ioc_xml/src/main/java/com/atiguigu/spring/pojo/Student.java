package com.atiguigu.spring.pojo;

import java.util.Arrays;
import java.util.Map;

public class Student {
    private  Integer sid;
    private  String sname;
    private  String gender;
    private Integer age;
    private  String[] hooby;

    private Clazz clazz;
    private Map<String,Teacher> teacherMap;

    public Student() {
    }

    public Student(Integer sid, String sname, String gender, Integer age) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.age = age;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHooby() {
        return hooby;
    }

    public void setHooby(String[] hooby) {
        this.hooby = hooby;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hooby=" + Arrays.toString(hooby) +
                ", clazz=" + clazz +
                ", teacherMap=" + teacherMap +
                '}';
    }

}
