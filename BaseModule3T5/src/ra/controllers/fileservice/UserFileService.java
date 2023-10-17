package ra.controllers.fileservice;

import ra.models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFileService {
    File userFile;

    public UserFileService() {
        File dataDir = new File("data");
        if (!dataDir.exists()) {
            dataDir.mkdir();
        }
        File userFile = new File("data/user.dat");
        try {
            if (!userFile.exists()) {
                userFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi khởi tạo file");
        }
        this.userFile = userFile;
    }
    public void saveToFile(List<User> users) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.userFile);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(users);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi thêm mới user");
        }
    }

    public User getUserByUsername(String username) {
        List<User> allUser = getAllUser();
        for (User user : allUser) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(this.userFile);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            users = (List<User>) inputStream.readObject();
        } catch (EOFException e) {

        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file");
        } catch (ClassNotFoundException e) {

        }

        return users;
    }
}
