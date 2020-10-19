package com.itheima.day01.task02;

/**
 * Created by Jason on 2020/10/5 22:36
 */
public class HouYi extends Hero {
//    public HouYi(String name, int HP, int MP, int attack, int defenses) {
//        super("后羿", 3500, 2600, 160, 210);
//    }

    public HouYi(String name, int HP, int MP, int attack, int defenses) {
        super(name, HP, MP, attack, defenses);
    }

    public void say() {
        System.out.println(this.getName() + "说：周日，被我射熄火了，所以今天是周一！");
    }
    //表示后羿发动一技能
    public void startFirstAbility() {
        startAbility(new Ability("炙热之风", (int) 1.5,10));
    }
    //表示后羿发动二技能
    public void startSecondAbility() {
        startAbility(new Ability("燎原箭雨",2,20));
    }
    //表示后羿发动三技能
    public void startThirdAbility() {
        startAbility(new Ability("惩戒射击",3,30));
    }
}
