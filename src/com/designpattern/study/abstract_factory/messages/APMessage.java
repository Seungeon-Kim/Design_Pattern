package com.designpattern.study.abstract_factory.messages;

import com.designpattern.study.abstract_factory.interfaces.IMessage;

public class APMessage implements IMessage {
    @Override
    public String print() {
        System.out.print("Target Platform is Android");
        return "Target Platform is Android";
    }
}
