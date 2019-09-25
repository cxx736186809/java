package Tes1.T_3;
/*
斗地主案例
 */
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<String>();
        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> numbers = new ArrayList<String>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        for (String color : colors) {
            for(String number : numbers){
                String card = color+number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("JOKER");
        pokerBox.add("joker");
        Collections.shuffle(pokerBox);
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        for(int i = 0;i<pokerBox.size();i++){
            String card = pokerBox.get(i);
            if(i>=51){
                dipai.add(card);
            } else {
                if(i%3==0){
                    player1.add(card);
                }else if(i%3==1){
                    player2.add(card);
                }else{
                    player3.add(card);
                }
            }
        }
        if(player1.contains("JOKER"))
            player1.addAll(dipai);
        else if (player2.contains("JOKER"))
            player2.addAll(dipai);
        else if (player3.contains("JOKER"))
            player3.addAll(dipai);
        System.out.println("小明："+player1);
        System.out.println("小红："+player2);
        System.out.println("小蓝："+player3);
        System.out.println("底牌："+dipai);
    }
}