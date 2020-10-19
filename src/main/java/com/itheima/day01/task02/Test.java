package com.itheima.day01.task02;

/**
 * Created by Jason on 2020/10/5 22:41
 */
public class Test {
    public static void main(String[] args) {
        HouYi houYi = new HouYi("后羿", 3500, 2600, 160, 210);
        LuBan luBan = new LuBan("鲁班七号", 3000, 2000, 150, 200);

        houYi.say();
        houYi.startFirstAbility();
        houYi.startSecondAbility();
        houYi.startThirdAbility();

        luBan.say();
        luBan.startFirstAbility();
        luBan.startSecondAbility();
        luBan.startThirdAbility();

    }
}
