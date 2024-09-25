package com.steam.steam_games.mapper;

import com.steam.steam_games.dto.GameDto;
import com.steam.steam_games.dto.PageDto;
import com.steam.steam_games.model.Game;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {
    public GameDto toDTO(Game game) {
        return GameDto.builder()
                .id(game.getId())
                .name(game.getName())
                .description(game.getDescription())
                .genre(game.getGenre().getName())
                .build();
    }

    public PageDto<GameDto> toDTO(Page<Game> page) {
        return PageDto.<GameDto>builder()
                .content(page.getContent().stream().map(this::toDTO).toList())
                .requestedPage(page.getNumber())
                .requestedSize(page.getSize())
                .totalPages(page.getTotalPages())
                .totalCount(page.getTotalElements())
                .last(page.isLast())
                .build();
    }
}
