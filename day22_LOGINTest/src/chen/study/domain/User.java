package chen.study.domain;

/**
 * 用户实体类
 */
public class User {
    private int id;
    private String username;
    private String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", USERNAME='" + username + '\'' +
                ", PASSWORD='" + password + '\'' +
                '}';
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

    public void setUsername(String USERNAME) {
        this.username = USERNAME;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String PASSWORD) {
        this.password = PASSWORD;
    }
}
