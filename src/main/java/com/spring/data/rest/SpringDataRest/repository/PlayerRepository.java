package com.spring.data.rest.SpringDataRest.repository;

import com.spring.data.rest.SpringDataRest.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
}
