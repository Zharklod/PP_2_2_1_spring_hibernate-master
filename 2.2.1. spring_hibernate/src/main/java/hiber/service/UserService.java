package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    User getUserByCarDetails(String model, String series);

    List<User> listUsers();
}
