package com.example.spring_xe_demo.model.repository;

import com.example.spring_xe_demo.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}
