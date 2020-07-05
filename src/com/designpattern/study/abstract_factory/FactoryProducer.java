package com.designpattern.study.abstract_factory;

import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.abstract_factory.interfaces.IMessage;
import com.designpattern.study.abstract_factory.messages.APMessage;
import com.designpattern.study.abstract_factory.messages.IPMessage;
import com.designpattern.study.abstract_factory.messages.MPMessage;
import com.designpattern.study.abstract_factory.messages.WPMessage;

public final class FactoryProducer {
//    private FactoryProducer(){
//        throw new AssertionError();
//    }
    public static IAbstractFactory getFactory(String factoryType){
        switch(factoryType)
        {
            case "Target": return new TargetPlatformFactory();
        }
        return null;
    }
}
