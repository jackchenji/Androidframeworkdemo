package com.cn.androidframeworkdemo.mvc.bean;

/**
 * author by chenji on 2020-06-27
 */

public class Person {
String name;
String height;
String age;

    public Person(String name, String height, String age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }






}
