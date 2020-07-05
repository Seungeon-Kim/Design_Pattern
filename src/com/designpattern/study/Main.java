package com.designpattern.study;

import com.designpattern.study.abstract_factory.FactoryProducer;
import com.designpattern.study.singleton.SingletonLazy;

public class Main {
    public static void main(String[] args) {
        SingletonLazy.getInstance().print();
        FactoryProducer.getFactory("Target").getInstance("Android");
    }
}
