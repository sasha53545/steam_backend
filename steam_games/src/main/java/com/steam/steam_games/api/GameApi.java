package com.steam.steam_games.api;

import com.steam.steam_games.dto.GameDto;
import com.steam.steam_games.dto.PageDto;
import com.steam.steam_games.mapper.GameMapper;
import com.steam.steam_games.service.GameService;
import com.steam.steam_games.swagger.GameApiSwagger;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/games")
@RequiredArgsConstructor
@Tag(name = "Игры")
public class GameApi implements GameApiSwagger {
    private final GameService gameService;
    private final GameMapper gameMapper;

    @Override
    @GetMapping
    public PageDto<GameDto> getAll(@RequestParam int page, @RequestParam int size) {
        return gameMapper.toDTO(gameService.getAll(page, size));
    }

    @Override
    @GetMapping("/{id}")
    public GameDto getById(@PathVariable int id) {
        return gameMapper.toDTO(gameService.getById(id));
    }
}