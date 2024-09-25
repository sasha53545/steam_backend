package com.steam.steam_games.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(name = "PageDto", description = "DTO с информацией по странице")
public class PageDto<T> {
    @Schema(description = "Контент")
    List<T> content;
    @Schema(description = "Требуемое количество страниц")
    int requestedPage;
    @Schema(description = "Требуемое количество элементов на странице")
    int requestedSize;
    @Schema(description = "Количество страниц")
    int totalPages;
    @Schema(description = "Количество элементов")
    long totalCount;
    @Schema(description = "Последняя страница")
    boolean last;
}
