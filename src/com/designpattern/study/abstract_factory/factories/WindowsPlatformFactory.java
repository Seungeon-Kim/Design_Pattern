package com.designpattern.study.abstract_factory.factories;

import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.abstract_factory.messages.AndroidProduct;
import com.designpattern.study.abstract_factory.messages.WindowsPProduct;

public class WindowsPlatformFactory implements IAbstractFactory {
    @Override
    public IProduct getInstance(String parserType) {
        switch(parserType){
            case "Windows": return new WindowsPProduct();
            case "Android": return new AndroidProduct();
        }
        return null;
    }
}
