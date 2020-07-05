package com.designpattern.study.abstract_factory.products;

import com.designpattern.study.abstract_factory.interfaces.IProduct;

public class WindowsPProduct implements IProduct {
    private String productName = "Windows";

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void print() {
        System.out.println("Product name is Windows");
    }
}
