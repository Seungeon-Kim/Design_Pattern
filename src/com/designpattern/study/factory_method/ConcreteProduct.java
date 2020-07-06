package com.designpattern.study.factory_method;

import com.designpattern.study.abstract_factory.interfaces.IProduct;

public class ConcreteProduct implements IProduct {
    private String productName = "Concrete";

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void print() {
        System.out.println("Product name is Concrete");
    }
}
