package com.designpattern.study.strategy;

import com.designpattern.study.strategy.interfaces.ISkill;
import com.designpattern.study.strategy.skills.Fire;
import com.designpattern.study.strategy.skills.Ice;

public class User extends Wizard {

    @Override
    public void setSkill(ISkill skill){
        super.setSkill(skill);
    }

    @Override
    public ISkill getSkill(){
        ISkill skill = super.getSkill();
        System.out.println(skill.skill());
        return skill;
    }
}
