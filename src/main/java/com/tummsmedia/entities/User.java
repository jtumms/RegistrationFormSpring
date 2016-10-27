package com.tummsmedia.entities;

import javax.persistence.*;

/**
 * Created by john.tumminelli on 10/26/16.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String email;

    public User() {
    }

    public User(String username, String address, String email) {
        this.username = username;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setuserame(String name) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
