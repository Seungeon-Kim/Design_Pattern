package com.designpattern.test.temp;

public class Child extends Parent {
    String name;
    String number;

    public Child(String gender, int age, int weight, int height, String name, String number) {
        super(gender, age, weight, height);
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("name :: " + name);
        System.out.println("number :: " + number);
    }
}
