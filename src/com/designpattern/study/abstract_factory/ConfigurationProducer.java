package com.designpattern.study.abstract_factory;

import com.designpattern.study.abstract_factory.factories.MacPlatformFactory;
import com.designpattern.study.abstract_factory.factories.WindowsPlatformFactory;
import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;

public final class ConfigurationProducer {
    public static IAbstractFactory getFactory(String factoryType){
        switch(factoryType)
        {
            case "Windows": return new WindowsPlatformFactory();
            case "Mac" : return new MacPlatformFactory();
        }
        return null;
    }
}
