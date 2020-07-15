package com.designpattern.study.strategy.skills;

import com.designpattern.study.strategy.interfaces.ISkill;

public class Fire implements ISkill {
    @Override
    public String skill() {
        return "Fire Skill";
    }
}
