package Tes1.T_3;

import java.util.HashMap;

/*
已知Map中保存如下信息:{“及时雨”=”宋江”, “玉麒麟”=”卢俊义”, “智多星”=”吴用”}
其中键表示水浒中人物的外号，value表示人物的姓名.
1. 往Map中添加“入云龙”=”公孙胜”, ”豹子头”=”林冲”两位好汉
2. 删除“玉麒麟”=”卢俊义”
3. 将key为“智多星”的value修改为null,
4. 将“及时雨”=”宋江”,修改为”呼保义”=” 宋江”
 */
public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("及时雨", "宋江");
        map.put("玉麒麟", "卢俊义");
        map.put("智多星", "吴用");
        System.out.println(map);
        map.put("入云龙", "公孙胜");
        map.put("豹子头", "林冲");
        System.out.println(map);
        map.remove("玉麒麟");
        System.out.println(map);
        map.put("智多星", null);
        System.out.println(map);
        map.put("呼保义", map.remove("及时雨"));
        System.out.println(map);
    }
}
