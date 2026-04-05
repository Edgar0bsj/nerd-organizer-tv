package com.github.nerdorganizer.nerd_organizer_tv.repository;

import com.github.nerdorganizer.nerd_organizer_tv.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SerieRepository extends JpaRepository<Serie, UUID> {
    List<Serie> findByTitulo(String titulo);
}
