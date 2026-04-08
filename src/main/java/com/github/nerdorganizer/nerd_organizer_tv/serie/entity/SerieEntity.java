package com.github.nerdorganizer.nerd_organizer_tv.serie.entity;

import com.github.nerdorganizer.nerd_organizer_tv.season.entity.SeasonEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "serie")
public class SerieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String title;

    @Column
    @Enumerated(EnumType.STRING)
    private Genres gender;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SeasonEntity> season;
}
