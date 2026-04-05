package com.github.nerdorganizer.nerd_organizer_tv.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "series")
public class Serie {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String titulo;
    @Column
    private String genero;
    @Column
    private int temporada;
    @Column
    private int episodeo;

    public int getEpisodeo() {
        return episodeo;
    }
    public void setEpisodeo(int episodeo) {
        this.episodeo = episodeo;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
