package com.itheima.day01.task02;

/**
 * Created by Jason on 2020/10/5 21:49
 */
public abstract class Hero {
    // 英雄的属性：名称；血量HP；魔法值MP；攻击力attack；防御defenses；
    private String name;
    private int HP;
    private int MP;
    private int attack;
    private int defenses;

    public Hero(String name, int HP, int MP, int attack, int defenses) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.attack = attack;
        this.defenses = defenses;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 英雄的功能：三个攻击技能，一个说台词的功能；
    public void startAbility(Ability ability) {
        int consume = ability.getMpConsume();
        if (this.MP < consume) {
            System.out.println("魔法不足，技能不能发动！");
        } else {
            this.MP -= consume;
            // 计算伤害
            double sh = this.attack * ability.getMultiple();
            System.out.println(this.name + "发动技能" + ability.getName() + "，耗费" + consume + "点魔法，对敌人造成" + sh + "点攻击！");
        }
    }

    public abstract void startFirstAbility();

    public abstract void startSecondAbility();

    public abstract void startThirdAbility();

    // 每种技能需要消耗固定MP，MP不足则无法释放技能；
    public abstract void say();

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefenses() {
        return defenses;
    }

    public void setDefenses(int defenses) {
        this.defenses = defenses;
    }
}
