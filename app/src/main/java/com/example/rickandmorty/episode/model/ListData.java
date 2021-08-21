package com.example.rickandmorty.episode.model;

import java.util.List;

public class ListData {
    private String type;
    private List<Season> seasons;
    private List<Episode> episodes;

    public ListData(String type, List<Season> seasons, List<Episode> episodes) {
        this.type = type;
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}

