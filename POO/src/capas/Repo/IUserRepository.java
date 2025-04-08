package capas.Repo;

import capas.User;

import java.util.List;

public interface IUserRepository {
    void saveUser(User user);//Create
    User getUserById(int id);
    List<User> getUsers();//Read
    User updateUser(User user);//Update
    void deleteUser(int id);//Delete

}
