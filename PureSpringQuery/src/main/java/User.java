/**
 * Created by Флюр on 21.06.2015.
 */
public class User {
    private int id;
    private String username;
    private String password;

//    public void getUserById(int id){
//        return .
//    }
    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
