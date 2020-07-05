package com.designpattern.study.abstract_factory;

import com.designpattern.study.abstract_factory.factories.MacPlatformFactory;
import com.designpattern.study.abstract_factory.factories.WindowsPlatformFactory;
import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.etc.Constants;

public final class ConfigurationProducer {
    public static IAbstractFactory getFactory(String os){
        switch(os)
        {
            case Constants.Opers.OP_WINDOWS: return new WindowsPlatformFactory();
            case Constants.Opers.OP_MAC: return new MacPlatformFactory();
        }
        return null;
    }
}
