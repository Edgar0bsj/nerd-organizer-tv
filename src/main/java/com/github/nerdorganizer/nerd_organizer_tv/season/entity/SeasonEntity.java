package com.github.nerdorganizer.nerd_organizer_tv.season.entity;

import com.github.nerdorganizer.nerd_organizer_tv.serie.entity.SerieEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "season")
public class SeasonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private int season;
    @Column
    private boolean assisted;

    @ManyToOne
    @JoinColumn(name = "serie_id", nullable = false)
    private SerieEntity serie;
}
