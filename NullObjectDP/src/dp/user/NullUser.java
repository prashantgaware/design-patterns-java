package dp.user;

public class NullUser extends User {

    public NullUser() {
        super("Guest");
    }

    @Override
    public String getName() {
        return "Guest";
    }
}
