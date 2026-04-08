package com.github.nerdorganizer.nerd_organizer_tv.season.repository;

import com.github.nerdorganizer.nerd_organizer_tv.season.entity.SeasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SeasonRepository extends JpaRepository<SeasonEntity, UUID> {
}
