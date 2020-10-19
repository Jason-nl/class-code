package com.itheima.day01.task02;

/**
 * Created by Jason on 2020/10/5 22:19
 */
public class Ability {//技能名称
    private String name;
    // 技能消耗MP
    private int mpConsume;
    // 技能对攻击增加的伤害倍数
    private double multiple;

    public Ability(String name, int mpConsume, double multiple) {
        this.name = name;
        this.mpConsume = mpConsume;
        this.multiple = multiple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMpConsume() {
        return mpConsume;
    }

    public void setMpConsume(int mpConsume) {
        this.mpConsume = mpConsume;
    }

    public double getMultiple() {
        return multiple;
    }

    public void setMultiple(double multiple) {
        this.multiple = multiple;
    }
}
