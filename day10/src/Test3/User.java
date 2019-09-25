package Test3;

public class User {
    private String type;//用户类型
    private int id;

    @Override
    public String toString() {
        return id +"-"+type;
    }

    public User(int id) {
        this.type = type;
        this.id = id;
    }

    public User() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
