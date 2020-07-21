package com.designpattern.test;


import com.designpattern.study.decorator.CPUDecorator;
import com.designpattern.study.decorator.IComputer;
import com.designpattern.study.decorator.GPUDecorator;
import com.designpattern.study.decorator.MyIComputer;

public class Main {
    public static void main(String[] args) {
//        Singleton + Abstract Factory Example
//        WindowsActivity windowsActivity = new WindowsActivity();
//        MacActivity macActivity = new MacActivity();

//        Strategy Example
//        User user = new User();
//        Fire fire = new Fire();
//        user.setSkill(fire);
//        user.getSkill();
//
//        Ice ice = new Ice();
//        user.setSkill(ice);
//        user.getSkill();

        IComputer IComputer = new MyIComputer();
        System.out.println("my computer spec :: " + IComputer.getSpec());

        IComputer = new GPUDecorator(IComputer);
        System.out.println("my computer spec :: " + IComputer.getSpec());

        IComputer = new CPUDecorator(IComputer);
        System.out.println("my computer spec :: " + IComputer.getSpec());

    }
}
