package com.lu.domain;

/**
 * @CLassName User
 * @Description TODO
 * @Author ll
 * @Date 2018/8/22 14:44
 **/
public class User {


    public User(){
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
