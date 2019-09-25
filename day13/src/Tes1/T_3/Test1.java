package Tes1.T_3;

import java.util.ArrayList;

/*
双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33中选择；蓝色球号
码从1—16中选择.请随机生成一注双色球号码
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> blueball = new ArrayList<>();
        ArrayList<String> redball = new ArrayList<>();
        ArrayList<String> ball = new ArrayList<>();

        for (int i = 1; i < 17; i++) {
            blueball.add("blue" + i);
        }
        for (int i = 1; i < 34; i++) {
            redball.add("red" + i);
        }
        for (int i = 0; i < 7; i++) {
                String a = redball.get((int)(1+Math.random()*32));
                ball.add(a);
        }
        String b = blueball.get((int)(1+Math.random()*6));
        ball.add(b);
        System.out.println(ball);
    }
}
