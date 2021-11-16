package com.example.Terraview.entities;

import java.util.List;

public class User {
    private List<UserDTO> users;

    public User() {}

    public User(List<UserDTO> users) {
        this.users = users;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "User{" +
                "users=" + users +
                '}';
    }
}
