package dp.user;

public class UserRepo {
    public User findUser(int userId) {
        if (userId == 1) {
            return new User("John Doe");
        }
        return new NullUser();
    }
}
