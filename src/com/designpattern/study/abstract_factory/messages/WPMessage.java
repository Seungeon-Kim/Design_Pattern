package com.designpattern.study.abstract_factory.messages;

import com.designpattern.study.abstract_factory.interfaces.IMessage;

public class WPMessage implements IMessage {
    @Override
    public String print() {
        System.out.print("Target Platform is Windows");
        return "Target Platform is Windows";
    }
}
