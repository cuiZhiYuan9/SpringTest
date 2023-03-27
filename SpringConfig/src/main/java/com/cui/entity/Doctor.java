package com.cui.entity;

import lombok.Data;

public class Doctor {
    private String name;
    private int age;
    private String hegiht;
    private void show(){
        System.out.println("ahahahahh");
    }
    ;

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

    public String getHegiht() {
        return hegiht;
    }

    public void setHegiht(String hegiht) {
        this.hegiht = hegiht;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hegiht='" + hegiht + '\'' +
                '}';
    }
}
