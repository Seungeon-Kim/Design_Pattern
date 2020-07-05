package com.designpattern.test.first_section;

import com.designpattern.study.abstract_factory.ConfigurationProducer;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.etc.Constants;
import com.designpattern.study.singleton.SingletonLazy;

public class Main {
    public static void main(String[] args) {
        WindowsActivity windowsActivity = new WindowsActivity();
        MacActivity macActivity = new MacActivity();
    }
}
