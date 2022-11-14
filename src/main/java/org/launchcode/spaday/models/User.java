package org.launchcode.spaday.models;

import javax.validation.constraints.Size;

public class User {

    private static int nextId = 1;

    private int id;
    @Size(min = 3)
    private String username;
    private String email;
    private String password;

    public User() {
        super();
        this.id = nextId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String aUsername) {
        this.username = aUsername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String aPassword) {
        this.password = aPassword;
    }

    public int getId() {
        return this.id;
    }

}
