package com.example.rickandmorty.character;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.rickandmorty.R;

import java.util.ArrayList;
import java.util.List;

public class CharacterViewModel extends ViewModel {
    private MutableLiveData<List<Character>> mutableLiveData;

    public CharacterViewModel() {
        mutableLiveData = new MutableLiveData<>();
        List<Character> characters = new ArrayList<>();
        characters.add(new Character(R.drawable.image1, "Dead", "Male","Agency Director"));
        characters.add(new Character(R.drawable.image2, "Alive", "Male","Rick Sanchez"));
        characters.add(new Character(R.drawable.image3, "Alive", "Male","Morty Smith"));
        characters.add(new Character(R.drawable.image4, "Alive", "Female","Summer Smith"));
        characters.add(new Character(R.drawable.image5, "Dead", "Male","Albert Einstein"));
        characters.add(new Character(R.drawable.image6, "Dead", "Male","Alan Rails"));
        characters.add(new Character(R.drawable.image7, "unknown", "Male","Abradolf Lincler"));
        characters.add(new Character(R.drawable.image8, "Dead", "Male","Alexander"));
        characters.add(new Character(R.drawable.image9, "Alive", "Male","Jerry Smith"));
        characters.add(new Character(R.drawable.image10, "Dead", "Male","Adjudicator Rick"));
        characters.add(new Character(R.drawable.image11, "Alive", "Male","Abadango Cluster Princess"));
        characters.add(new Character(R.drawable.image12, "Alive", "Female","Beth Smith"));
        characters.add(new Character(R.drawable.image13, "unknown", "Genderless","Alien Googah"));
        characters.add(new Character(R.drawable.image14, "unknown", "Genderless","Alien Morty"));
        characters.add(new Character(R.drawable.image15, "unknown", "Male","Alien Rick"));
        characters.add(new Character(R.drawable.image16, "Dead", "Male","Amish Cyborg"));
        characters.add(new Character(R.drawable.image17, "Alive", "Female","Annie"));
        characters.add(new Character(R.drawable.image18, "Alive", "Female","Antenna Morty"));
        characters.add(new Character(R.drawable.image19, "unknown", "Genderless","Antenna Rick"));
        characters.add(new Character(R.drawable.image20, "unknown", "Male","Ants in my Eyes Johnson"));
        mutableLiveData.setValue(characters);
    }

    public LiveData<List<Character>> getCharactersLiveData() {
        return mutableLiveData;
    }
}
