package com.designpattern.study.abstract_factory.factories;

import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.abstract_factory.messages.IosProduct;
import com.designpattern.study.abstract_factory.messages.MacProduct;

public class MacPlatformFactory implements IAbstractFactory {
    @Override
    public IProduct getInstance(String parserType) {
        switch(parserType){
            case "Mac": return new MacProduct();
            case "Ios": return new IosProduct();
        }
        return null;
    }
}
