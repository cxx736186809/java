public class Test4 {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}

interface Play {
    public abstract void playGame();
}

class OldPhone {
    public void call() {
        System.out.println("旧手机打电话");
    }

    public void sendMessage() {
        System.out.println("旧手机发短信");
    }
}

class NewPhone extends OldPhone implements Play {

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }

    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发短信");
    }
}