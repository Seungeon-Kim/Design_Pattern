package com.designpattern.study.abstract_factory.messages;

import com.designpattern.study.abstract_factory.interfaces.IMessage;

public class IPMessage implements IMessage {
    @Override
    public String print() {
        System.out.print("Target Platform is Ios");
        return "Target Platform is Ios";
    }
}
