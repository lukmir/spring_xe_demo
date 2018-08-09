package com.example.spring_xe_demo.model.repository;

import com.example.spring_xe_demo.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
