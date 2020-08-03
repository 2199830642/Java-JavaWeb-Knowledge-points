package chen.study.Servlet;

/**
 * 用户实体类
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String checkCode;

    public User() {
    }

    public User(int id, String username, String password, String checkCode) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.checkCode = checkCode;
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

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", checkCode='" + checkCode + '\'' +
                '}';
    }
}
