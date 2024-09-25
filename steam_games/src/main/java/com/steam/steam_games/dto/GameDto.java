package com.steam.steam_games.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(name = "GameDto", description = "DTO с информацией по игре")
public class GameDto {
    @Schema(description = "ID игры")
    Integer id;
    String name;
    String description;
    String genre;
}
