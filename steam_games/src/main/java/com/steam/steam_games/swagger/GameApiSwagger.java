package com.steam.steam_games.swagger;

import com.steam.steam_games.dto.ErrorDto;
import com.steam.steam_games.dto.GameDto;
import com.steam.steam_games.dto.PageDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;

public interface GameApiSwagger {
    @Operation(summary = "Получить все игры", description = "Возвращает все игры")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Игры найдены", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = GameDto.class))),
            @ApiResponse(responseCode = "404", description = "Игры не найдены", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorDto.class)))
    })
    PageDto<GameDto> getAll(int page, int size);

    @Operation(summary = "Получить игру по ID", description = "Возвращает игру по ее уникальному идентификатору")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Игра с таким ID найдена", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = GameDto.class))),
            @ApiResponse(responseCode = "404", description = "Игра с таким ID не существует", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorDto.class)))
    })
    GameDto getById(@Parameter(required = true) int id);
}
