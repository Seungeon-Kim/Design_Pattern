package com.designpattern.study.abstract_factory.messages;

import com.designpattern.study.abstract_factory.interfaces.IMessage;

public class MPMessage implements IMessage {
    @Override
    public String print() {
        System.out.print("Target Platform is Mac");
        return "Target Platform is Mac";
    }
}
