package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users=new ArrayList<>();
        User user1=new User();
        user1.setAge(10);
        user1.setName("name1");
        user1.setAccount("account1");
        user1.setEmail("email1");
        user1.setPassword("password1");
        users.add(user1);

        User user2=new User();
        user2.setAge(20);
        user2.setName("name2");
        user2.setAccount("account2");
        user2.setEmail("email2");
        user2.setPassword("password2");
        users.add(user2);

        User user3=new User();
        user3.setAge(30);
        user3.setName("name3");
        user3.setAccount("account3");
        user3.setEmail("email3");
        user3.setPassword("password3");
        users.add(user3);

        User user4=new User();
        user4.setAge(40);
        user4.setName("name4");
        user4.setAccount("account4");
        user4.setEmail("email4");
        user4.setPassword("password4");
        users.add(user4);

    }
    public static User ckeckLogin(Login login){
        for (User user:users){
            if (user.getAccount().equals(login.getAccount())&&user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
