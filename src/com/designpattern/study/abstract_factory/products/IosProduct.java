package com.designpattern.study.abstract_factory.products;

import com.designpattern.study.abstract_factory.interfaces.IProduct;

public class IosProduct implements IProduct {
    private String productName = "Ios";

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void print() {
        System.out.println("Product name is Ios");
    }
}
