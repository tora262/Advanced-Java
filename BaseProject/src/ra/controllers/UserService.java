package ra.controllers;

import ra.controllers.file.UserFileService;
import ra.models.User;

public class UserService {
    private UserFileService userFileService;

    public UserService(UserFileService userFileService) {
        this.userFileService = userFileService;
    }

    public boolean validate(String username, String password) {
        User user = userFileService.getByUsername(username);

        if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return true;
        }

        return false;
    }

    public boolean createUser(User user) {
        return userFileService.writeUser(user);
    }
}
