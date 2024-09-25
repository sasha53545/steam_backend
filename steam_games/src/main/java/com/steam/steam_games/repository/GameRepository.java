package com.steam.steam_games.repository;

import com.steam.steam_games.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {}