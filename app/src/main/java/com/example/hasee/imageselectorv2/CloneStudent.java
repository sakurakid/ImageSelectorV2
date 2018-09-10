package com.example.hasee.imageselectorv2;

public class CloneStudent implements Cloneable {
    private int age;  //年龄
    private Student student;//名字
    private String king;//学生的类型

    CloneStudent(int age,Student student,String king){
        System.out.println("执行了构造方法");
        this.age = age;
        this.student = student;
        this.king = king;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneStudent cloneStudent = null;
        try {
            cloneStudent = (CloneStudent)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cloneStudent;
    }

    public int getAge() {
        return age;
    }

    public String getKing() {
        return king;
    }

    public Student getStudent() {
        return student;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKing(String king) {
        this.king = king;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return  "CloneStudent["+"age  = "+age+"  Student:"+student.toString()+" kind :"+king+"}";

    }
}
