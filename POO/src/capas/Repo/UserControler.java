package capas.Repo;

import capas.User;
import capas.service.UserServiceUI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserControler {
    private UserServiceUI userService;
    public UserControler(UserServiceUI userService) {
        this.userService = userService;
    }
    public void showUsers(int id){
        User userById = userService.getUserById(id);
    }

    public static class UserRepository implements IUserRepository {

        private Iterable<User> users;

        public UserRepository() {
            ArrayList<User> users = new ArrayList<>();
            User u1 = new User("Mana", 1, "corva", "manumk1@gmail");
            User u2 = new User("Mane", 2, "corve", "manumk@2gmail");
            User u3 = new User("Mani", 3, "corvi", "manumk@g3mail");
            User u4 = new User("Mano", 4, "corvo", "manumk@gm4ail");
            User u5 = new User("Manu", 5, "corvu", "manumk@gma5il");

            users.add(u1);
            users.add(u2);
            users.add(u3);
            users.add(u4);
            users.add(u5);

        }


        @Override
        public User getUserById(int id) {

            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()) {
                User user = iterator.next();
                if (user.getId() == id) {
                    return user;
                }
            }
            return null;
        }

        @Override
        public User updateUser(User userParam) {
            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()) {
                User user = iterator.next();
                if (user.getId() == userParam.getId()) {
                    iterator.remove();
                    iterator.add(userParam);
                    return userParam;
                }

            }
            return null;
        }

        @Override
        public void deleteUser(int id) {
            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()) {
                User user = iterator.next();
                if (user.getId() == id) {
                    iterator.remove();
                    return;
                }
            }

        }

        @Override
        public void saveUser(User user) {
            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()) {
                User user1 = iterator.next();
                if (user.getId() == user1.getId()) {

                }
            }
        }

        @Override
        public List<User> getUsers() {
            String user = "";
            for (User u : users) {
                System.out.println(u);


            }
        }
    }
}
