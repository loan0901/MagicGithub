package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();


    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void generateRandomUser() {
        users.add(User.random());
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }
}
