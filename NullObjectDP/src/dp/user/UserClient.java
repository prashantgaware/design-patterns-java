package dp.user;

public class UserClient {
    public static void main(String[] args) {
        UserRepo repo = new UserRepo();
        User user1 = repo.findUser(1);
        System.out.println(user1.getName());
        User user2 = repo.findUser(99);
        System.out.println(user2.getName());
    }
}
