package com.steam.steam_games.service;

import com.steam.steam_games.model.Game;
import com.steam.steam_games.repository.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public Page<Game> getAll(int page, int size) {
        PageRequest pageQuery = PageRequest.of(page, size);
        return gameRepository.findAll(pageQuery);
    }

    public Game getById(int id) throws EntityNotFoundException {
        return gameRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Игра с ID = " + id + " не существует."));
    }
}
