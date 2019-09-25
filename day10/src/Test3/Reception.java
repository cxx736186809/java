package Test3;

public class Reception {
    Filter f;

    public Reception() {
    }

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public Reception(Filter f)    {
        this.f = f;
    }

    public void reception(User u) {
        if (u.getType() != null)
            return;
        if (f != null) {
            f.filterUser(u);
            return;
        } else {
            u.setType("A");
        }
    }
}
