package com.example.rickandmorty.episode.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.rickandmorty.episode.model.Episode;
import com.example.rickandmorty.episode.model.Season;

import java.util.ArrayList;
import java.util.List;

public class EpisodeViewModel extends ViewModel {
    private MutableLiveData<List<Season>> listMutableLiveData;
    private List<Season> seasons;

    public EpisodeViewModel() {
        listMutableLiveData = new MutableLiveData<>();
        initDataSeason();
    }

    public MutableLiveData<List<Season>> getListSeasonLiveData() {
        return listMutableLiveData;
    }

    private void initDataSeason() {
        seasons = new ArrayList<>();
        seasons.add(new Season(1,"Season 1", getListEpisode()));
        seasons.add(new Season(2,"Season 2", getListEpisode()));

        listMutableLiveData.setValue(seasons);
    }

    private List<Episode> getListEpisode() {
        List<Episode> episodes = new ArrayList<>();
            episodes.add(new Episode(1,"S01E01", "Pilot", "DECEMBER 2, 2013"));
            episodes.add(new Episode(2,"S01E02", "Lawnmower Dog", "December 9, 2013"));
            episodes.add(new Episode(3,"S01E03", "Anatomy Park", "December 16, 2013"));
            episodes.add(new Episode(4,"S01E04", "M. Night Shaym-Aliens!", "January 13, 2014"));
            episodes.add(new Episode(5,"S01E05", "Meeseeks and Destroy", "January 20, 2014"));
            episodes.add(new Episode(6,"S01E06", "Rick Potion #9", "January 27, 2014"));
            episodes.add(new Episode(7,"S01E07", "Raising Gazorpazorp", "March 10, 2014"));
            episodes.add(new Episode(8,"S01E08", "Rixty Minutes", "March 17, 2014"));
            episodes.add(new Episode(9,"S01E09", "Something Ricked This Way Comes", "March 24, 2014"));
            episodes.add(new Episode(10,"S01E10", "Close Rick-counters of the Rick Kind", "April 7, 2014"));
            episodes.add(new Episode(11,"S01E11", "Ricksy Business", "April 14, 2014"));

            episodes.add(new Episode(1,"S02E01", "A Rickle in Time", "July 26, 2015"));
            episodes.add(new Episode(2,"S02E02", "Mortynight Run", "August 2, 2015"));
            episodes.add(new Episode(3,"S02E03", "Auto Erotic Assimilation", "August 9, 2015"));
            episodes.add(new Episode(4,"S02E04", "Total Rickall", "August 16, 2015"));
            episodes.add(new Episode(5,"S02E05", "Get Schwifty", "August 23, 2015"));
            episodes.add(new Episode(6,"S02E06", "The Ricks Must Be Crazy", "August 30, 2015"));
            episodes.add(new Episode(7,"S02E07", "Big Trouble in Little Sanchez", "September 13, 2015"));
            episodes.add(new Episode(8,"S02E08", "Interdimensional Cable 2: Tempting Fate", "September 20, 2015"));

        return episodes;
    }
}
