package com.example.spring_xe_demo.controller.runner;

import com.example.spring_xe_demo.model.Game;
import com.example.spring_xe_demo.model.Player;
import com.example.spring_xe_demo.model.repository.GameRepository;
import com.example.spring_xe_demo.model.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.Random;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    GameRepository gameRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        System.out.println("XXXX: " + dataSource);
        System.out.println("XXXX: before creating new player");

        Player player = new Player();
        player.setUserName("lukmir" + new Random().nextInt(1000));
        player.setLastName("lukmir" + new Random().nextInt(1000));
        player.setAge(new Random().nextInt(60));

        playerRepository.save(player);
        System.out.println("XXXX: after creating new player");

        Player player1 = playerRepository.findById(1L).get();
        System.out.println("XXXX: player exists: " + player1 == null);

        Game game = new Game();
        game.setGameName("nowa gra" + new Random().nextInt(888));
        game.setDescription("desc" + new Random().nextInt(423432));

        gameRepository.save(game);



    }
}
