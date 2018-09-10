package com.example.hasee.imageselectorv2;

public class Student {
    private String name; //名字
    Student(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:"+name;
    }
}
