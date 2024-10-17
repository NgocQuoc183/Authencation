package quoc.dev.data.dao;

import java.util.List;
import quoc.dev.data.model.User;

public interface UserDAO {
    boolean insert(User user);
    boolean update(User user);
    boolean delete(int id); 
    User find(int id);
    List<User> findAll();
    User find(String email, String password);
    User find(String email);
    User checkAccount(String email, String password);
}
