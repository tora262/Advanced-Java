package ra.controllers;

import ra.controllers.fileservice.UserFileService;
import ra.models.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private final UserFileService userFileService;
    private List<User> allUser = new ArrayList<>();

    public UserService(UserFileService userFileService) {
        this.userFileService = userFileService;
    }

    private int countAllUser() {
        return userFileService.getAllUser().size();
    }

    public int autoInc() {
        return countAllUser() + 1;
    }
    public void saveUser(User user) {
        allUser = userFileService.getAllUser();
        allUser.add(user);
        userFileService.saveToFile(allUser);
    }

    public User login(String username, String password) {
        User user = userFileService.getUserByUsername(username);
        if (user != null && user.isStatus() && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }

    public List<User> getSortedUserList() {
        List<User> sortedUsers = userFileService.getAllUser();
        Collections.sort(sortedUsers, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getUsername().compareTo(o2.getUsername());
            }
        });

        return sortedUsers;
    }

    /*
    Lấy ra danh sách các username theo từ khoá truyền vào
     */
    public List<User> getUserListByUsername(String username) {
        List<User> allUsers = userFileService.getAllUser();
        List<User> filteredUsers = new ArrayList<>();
        for (User user : allUsers) {
            if (user.getUsername().toLowerCase().contains(username.toLowerCase())) {
                filteredUsers.add(user);
            }
        }

        return filteredUsers;
    }

    public User getUserByUsername(String username) {
        return userFileService.getUserByUsername(username);
    }

    public void setStatusByUsername(boolean status, String username) {
        allUser = userFileService.getAllUser();
        for (User user : allUser) {
            if (user.getUsername().equals(username)) {
                user.setStatus(status);
            }
        }

        userFileService.saveToFile(allUser);

    }
}
