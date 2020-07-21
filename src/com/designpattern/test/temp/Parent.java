package com.designpattern.test.temp;

public class Parent {
    String gender;
    int age;
    int weight;
    int height;

    public Parent(String gender, int age, int weight, int height){
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void print(){
        System.out.println("gender :: " + gender);
        System.out.println("age :: " + age);
        System.out.println("weight :: " + weight);
        System.out.println("height :: " + height);
    }

    public void hello(){
        System.out.println("Hello");
    }
}
