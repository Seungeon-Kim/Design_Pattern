package com.designpattern.test;

import com.designpattern.study.abstract_factory.ConfigurationProducer;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.singleton.SingletonLazy;

public class Main {
    public static void main(String[] args) {
        SingletonLazy.getInstance().print();

        IProduct product = ConfigurationProducer.getFactory("Windows").getInstance("Android");

        product.print();
    }
}
