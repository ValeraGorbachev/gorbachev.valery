package app.entity;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String password;
    private String email;
    private String userRole;

    public User() {
    }

    public User(Integer id, String userName, String password, String email, String userRole) {
        this.userId = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userRole = userRole;
    }

    public User(String userName, String password, String email, String userRole) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userRole = userRole;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRole() {
        return userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(userRole, user.userRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, password, email, userRole);
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}