package com.example.spring_xe_demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GAMES")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GAME_SEQ")
    @SequenceGenerator(sequenceName = "game_sequence", allocationSize = 1, name = "GAME_SEQ")
    private Long id;

    @Column(name = "GAME_NAME")
    private String gameName;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
