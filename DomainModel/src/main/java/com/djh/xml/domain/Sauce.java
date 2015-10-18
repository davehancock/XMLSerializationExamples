package com.djh.xml.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Hancock
 */
public class Sauce {

    private int volume;

    private List<String> ingredients = new ArrayList<>();

    public Sauce(int volume, List<String> ingredients) {
        this.volume = volume;
        this.ingredients = ingredients;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
