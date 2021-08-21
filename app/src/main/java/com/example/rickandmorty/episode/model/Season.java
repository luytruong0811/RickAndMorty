package com.example.rickandmorty.episode.model;

import java.util.List;

public class Season {
    private int idSeason;
    private String season;
    private List<Episode> episodes;

    public Season(int idSeason, String season, List<Episode> episodes) {
        this.idSeason = idSeason;
        this.season = season;
        this.episodes = episodes;
    }

    public int getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(int idSeason) {
        this.idSeason = idSeason;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
