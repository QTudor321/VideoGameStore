package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "IDuser", nullable = false)
    private int id;

    @Column(name = "Username", length = 45)
    private String username;

    @Column(name = "LastName", length = 45)
    private String lastName;

    @Column(name = "FirstName", length = 45)
    private String firstName;

    @Column(name = "Location", length = 45)
    private String location;

    @Column(name = "Password", length = 45)
    private String password;
    public User(){}
    public User(String username, String lastName, String firstName, String location, String password) {
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
        this.location = location;
        this.password = password;
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}