package Test5;

public class Player {
    public static FightAble FightAbleselect(String str) {
        if (str == "法力角色") {
            return new Master();
        }else if(str == "武力角色"){
            return new Warrior();
        }
        return null;
    }
}
