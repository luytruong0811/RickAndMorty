package com.example.rickandmorty.location;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class LocationViewModel extends ViewModel {
    MutableLiveData<List<Location>> mutableLiveData;

    public LocationViewModel() {
        mutableLiveData = new MutableLiveData<>();
        List<Location> locations= new ArrayList<>();
        locations.add(new Location("Earth (C-137)", "Planet", "2Gb"));
        locations.add(new Location("Abadango", "Cluster", "2Gb"));
        locations.add(new Location("Citadel of Ricks", "Space station", "2Gb"));
        locations.add(new Location("Worldender's lair", "Planet", "2Gb"));
        locations.add(new Location("Anatomy Park", "Microverse", "2Gb"));
        locations.add(new Location("Interdimensional Cable", "TV", "2Gb"));
        locations.add(new Location("Immortality Field Resort", "Resort", "2Gb"));
        locations.add(new Location("Post-Apocalyptic Earth", "Planet", "2Gb"));
        locations.add(new Location("Purge Planet", "Planet", "2Gb"));
        locations.add(new Location("Venzenulon 7", "Planet", "2Gb"));
        locations.add(new Location("Bepis 9", "Planet", "2Gb"));
        locations.add(new Location("Cronenberg Earth", "Planet", "2Gb"));
        locations.add(new Location("Nuptia 4", "Planet", "2Gb"));
        locations.add(new Location("Giant's Town", "Fantasy town", "2Gb"));
        locations.add(new Location("Bird World", "Planet", "2Gb"));
        locations.add(new Location("St. Gloopy Noops Hospital", "Space station", "2Gb"));
        locations.add(new Location("Earth (5-126)", "Planet", "2Gb"));
        locations.add(new Location("Mr. Goldenfold's dream", "Dream", "2Gb"));
        locations.add(new Location("Gromflom Prime", "Planet", "2Gb"));
        locations.add(new Location("Earth (Rpl. Dimension)", "Planet", "2Gb"));
        mutableLiveData.setValue(locations);
    }

    public LiveData<List<Location>> getLocationsLiveData() {
        return mutableLiveData;
    }
}
