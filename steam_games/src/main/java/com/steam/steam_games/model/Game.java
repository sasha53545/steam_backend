package com.steam.steam_games.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue
    Integer id;
    @NotNull
    String name;
    @Column(columnDefinition = "varchar(5000)")
    String description;

    @ManyToOne
    Genre genre;
}
