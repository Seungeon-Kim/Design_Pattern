package com.designpattern.study.decorator;

public class GPUDecorator extends Decorator {
    private final IComputer IComputer;

    public GPUDecorator(IComputer IComputer) {
        this.IComputer = IComputer;
    }

    @Override
    public int getSpec() {
        return this.IComputer.getSpec() * 2;
    }
}
