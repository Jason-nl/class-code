package com.itheima.day05.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test08 {
    public static void main(String[] args) {
        /*
        需求：使用集合保存并按以下格式输出下列数据：

            河北省:

                秦皇岛市:[海港区, 山海关区, 北戴河区, 昌黎县]

                唐山市:[路北区, 路南区, 古冶区, 开平区]

                石家庄市:[石家庄市, 长安区, 桥东区, 桥西区, 新华区；]

            河南省:

                郑州市:[中原区, 金水区, 二七区, 管城回族区]

                洛阳市:[西工区, 老城区, 涧西区, 洛龙区]

                开封市:[鼓楼区, 龙亭区, 顺河回族区, 禹王台区]
         */
        Map<String, List<Map<String, List<String>>>> heBeiMap = new HashMap<>();
        List<Map<String, List<String>>> heBeiList = new ArrayList<>();
        Map<String, List<String>> qinMap = new HashMap<>();
        ArrayList<String> qinList = new ArrayList<>();
        qinList.add("海港区");
        qinList.add("山海关区");
        qinList.add("北戴河区");
        qinList.add("昌黎县");
        qinMap.put("秦皇岛市", qinList);

        Map<String, List<String>> tangMap = new HashMap<>();
        ArrayList<String> tangList = new ArrayList<>();
        tangList.add("路北区");
        tangList.add("路南区");
        tangList.add("古冶区");
        tangList.add("开平区");
        tangMap.put("唐山市", tangList);

        Map<String, List<String>> shiMap = new HashMap<>();
        ArrayList<String> shiList = new ArrayList<>();
        shiList.add("石家庄市");
        shiList.add("长安区");
        shiList.add("桥东区");
        shiList.add("桥西区");
        shiList.add("新华区");
        shiMap.put("石家庄市", shiList);

        heBeiList.add(qinMap);
        heBeiList.add(tangMap);
        heBeiList.add(shiMap);
        heBeiMap.put("河北省", heBeiList);

        for (Map.Entry<String, List<Map<String, List<String>>>> entry : heBeiMap.entrySet()) {
            String province = entry.getKey();
            List<Map<String, List<String>>> list = entry.getValue();
            for (Map<String, List<String>> map : list) {
                for (Map.Entry<String, List<String>> listEntry : map.entrySet()) {
                    String shi = listEntry.getKey();
                    List<String> quList = listEntry.getValue();
                    System.out.println(province + "-" + shi + quList);
                }
            }
        }

         Map<String, List<Map<String, List<String>>>> heNanMap = new HashMap<>();
        List<Map<String, List<String>>> hnList = new ArrayList<>();
        Map<String, List<String>> zhengzhouMap = new HashMap<>();
        ArrayList<String> zhengzhouList = new ArrayList<>();
        // 郑州市:[中原区, 金水区, 二七区, 管城回族区]
        zhengzhouList.add("中原区");
        zhengzhouList.add("金水区");
        zhengzhouList.add("二七区");
        zhengzhouList.add("管城回族区");
        zhengzhouMap.put("郑州市", zhengzhouList);

        // 洛阳市:[西工区, 老城区, 涧西区, 洛龙区]
        Map<String, List<String>> luoMap = new HashMap<>();
        ArrayList<String> luoList = new ArrayList<>();
        luoList.add("西工区");
        luoList.add("老城区");
        luoList.add("涧西区");
        luoList.add("洛龙区");
        luoMap.put("洛阳市", luoList);

        //开封市:[鼓楼区, 龙亭区, 顺河回族区, 禹王台区]
        Map<String, List<String>> kaiMap = new HashMap<>();
        ArrayList<String> kaiList = new ArrayList<>();
        kaiList.add("鼓楼区");
        kaiList.add("龙亭区");
        kaiList.add("顺河回族区");
        kaiList.add("禹王台区");
        kaiMap.put("开封市", kaiList);

        hnList.add(zhengzhouMap);
        hnList.add(luoMap);
        hnList.add(kaiMap);
        heNanMap.put("河南省", hnList);

//

        for (Map.Entry<String, List<Map<String, List<String>>>> entry : heNanMap.entrySet()) {
            String province = entry.getKey();
            List<Map<String, List<String>>> list = entry.getValue();
            for (Map<String, List<String>> map : list) {
                for (Map.Entry<String, List<String>> listEntry : map.entrySet()) {
                    String shi = listEntry.getKey();
                    List<String> quList = listEntry.getValue();
                    System.out.println(province + "-" + shi + quList);
                }
            }
        }

    }
}
