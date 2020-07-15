package com.designpattern.study.strategy;

import com.designpattern.study.strategy.interfaces.ISkill;

public class Wizard {
    private ISkill skill;

    public void setSkill(ISkill skill){
        this.skill = skill;
    }

    public ISkill getSkill(){
        return this.skill;
    }
}
