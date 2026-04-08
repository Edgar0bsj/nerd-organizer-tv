package com.github.nerdorganizer.nerd_organizer_tv.serie.repository;

import com.github.nerdorganizer.nerd_organizer_tv.serie.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SerieRepository extends JpaRepository<SerieEntity, UUID> {
}
