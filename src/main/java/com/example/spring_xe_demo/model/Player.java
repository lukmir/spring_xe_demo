package com.example.spring_xe_demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PLAYERS")
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLAYER_SEQ")
    @SequenceGenerator(sequenceName = "player_sequence", allocationSize = 1, name = "PLAYER_SEQ")
    private Long id;

    private String userName;

    private String lastName;

    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
