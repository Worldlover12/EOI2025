package capas.Repo;

import capas.User;

import java.util.List;

public class UserService implements UserServiceUI{
    IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.saveUser(user);

    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);

    }

    public String getCompleteName(int id) {
        User userbyid = UserControler.UserRepository.getUserById(id);
        if (userbyid != null) {
            return userbyid.getName() + " " + userbyid.getLastName();
        }else{
            return "el usuario no existe";
        }
    }
    public String getAllUsers() {
        List<User> users = UserControler.UserRepository.getUsers();
    }
    public String getReverseName(int id) {

    }
    private String reverseString(String str) {
        char[] chars = str.toCharArray();
        char[] reversedChars = new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedChars[i] = chars[i];
        }
        return new String(reversedChars);

    }

}
