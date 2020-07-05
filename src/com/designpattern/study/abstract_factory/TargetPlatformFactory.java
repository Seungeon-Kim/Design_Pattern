package com.designpattern.study.abstract_factory;

import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.abstract_factory.interfaces.IMessage;
import com.designpattern.study.abstract_factory.messages.APMessage;
import com.designpattern.study.abstract_factory.messages.IPMessage;
import com.designpattern.study.abstract_factory.messages.MPMessage;
import com.designpattern.study.abstract_factory.messages.WPMessage;

public class TargetPlatformFactory implements IAbstractFactory {
    @Override
    public IMessage getInstance(String parserType) {
        switch(parserType){
            case "Windows": return new WPMessage();
            case "Mac": return new MPMessage();
            case "Android": return new APMessage();
            case "Ios": return new IPMessage();
        }
        return null;
    }
}
