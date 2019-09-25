package Test5;

public class Test5 {
    public static void main(String[] args) {
        Player player = new Player();
        String select = "法力角色";
        System.out.println("选择:\n" + select);
        FightAble f = player.FightAbleselect(select);
        f.specialFight();
        f.commonFight();
        System.out.println("=================");
        select = "武力角色";
        System.out.println("选择:\n" + select);
        FightAble f2 = player.FightAbleselect(select);
        f2.specialFight();
        f2.commonFight();
    }
}
