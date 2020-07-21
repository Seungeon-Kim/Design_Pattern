package com.designpattern.study.decorator;

public class CPUDecorator extends Decorator{
    private final IComputer IComputer;

    public CPUDecorator(IComputer IComputer) {
        this.IComputer = IComputer;
    }

    @Override
    public int getSpec() {
        return this.IComputer.getSpec() * 4;
    }
}
