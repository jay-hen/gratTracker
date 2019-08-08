package com.jesshenry.grattracker.Models;

import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=8)
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
