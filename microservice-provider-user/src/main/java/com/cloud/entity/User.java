package com.cloud.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public User(Integer id, String username, Integer age) {
        this.username = username;
        this.age = age;
        this.id = id;

    }


    public User() {
    }

}
