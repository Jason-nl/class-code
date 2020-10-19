package com.itheima.day01.task02;

/**
 * Created by Jason on 2020/10/5 22:39
 */
public class LuBan extends Hero {
//    public LuBan(String name, int HP, int MP, int attack, int defenses) {
//        super("鲁班七号", 3000, 2000, 150,200);
//    }


    public LuBan(String name, int HP, int MP, int attack, int defenses) {
        super(name, HP, MP, attack, defenses);
    }

    @Override
    public void startFirstAbility() {
        startAbility(new Ability("河豚手雷", (int) 1.5,10));
    }

    @Override
    public void startSecondAbility() {
        startAbility(new Ability("无敌鲨鱼炮", (int) 2.5,25));
    }

    @Override
    public void startThirdAbility() {
        startAbility(new Ability("空中支援",3,40));
    }

    @Override
    public void say() {
        System.out.println(this.getName() + "说：借你们肉体实验新发明的威力！");
    }


}
