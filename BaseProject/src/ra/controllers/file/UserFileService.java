package ra.controllers.file;

import ra.models.User;

import javax.rmi.CORBA.Stub;
import java.io.*;

public class UserFileService {
    public ObjectInputStream inputStream;
    public ObjectOutputStream outputStream;

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
            FileInputStream fileInputStream = new FileInputStream(userFile);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            this.inputStream = inputStream;

            FileOutputStream fileOutputStream = new FileOutputStream(userFile);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            this.outputStream = outputStream;
        } catch (IOException e) {
            System.err.println(UserFileService.class + ": Đã xảy ra lỗi khi thiết lập dữ liệu");
            e.printStackTrace();
        }
    }
    public User getByUsername(String username) {
        try {
            while (true) {
                User user = (User) this.inputStream.readObject();
                if (user.getUsername().equals(username)) {
                    return user;
                }
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException e) {
            System.err.println(UserFileService.class + ": Đã có lỗi xảy ra khi đọc file");
        } catch (IOException e) {

        }

        return null;
    }

    public boolean writeUser(User user) {
        try {
            outputStream.writeObject(user);
        } catch (IOException e) {
            return false;
        }

        return true;
    }
}
