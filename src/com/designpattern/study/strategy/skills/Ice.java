package com.designpattern.study.strategy.skills;

import com.designpattern.study.strategy.interfaces.ISkill;

public class Ice implements ISkill {
    @Override
    public String skill() {
        return "Ice Skill";
    }
}
