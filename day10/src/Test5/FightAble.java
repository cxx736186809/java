package Test5;

public interface FightAble {
    public abstract void specialFight();
    public default void commonFight(){
        System.out.println("普通打击");
    }
}
