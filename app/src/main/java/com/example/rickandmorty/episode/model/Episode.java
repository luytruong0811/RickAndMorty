package com.example.rickandmorty.episode.model;

public class Episode {
    private int idEpisode;
    private String episode;
    private String name;
    private String date;

    public Episode(int idEpisode, String episode, String name, String date) {
        this.idEpisode = idEpisode;
        this.episode = episode;
        this.name = name;
        this.date = date;
    }

    public int getIdEpisode() {
        return idEpisode;
    }

    public void setIdEpisode(int idEpisode) {
        this.idEpisode = idEpisode;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
