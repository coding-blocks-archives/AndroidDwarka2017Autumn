package com.codingblocks.pokeapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by harshit on 13/10/17.
 */
public class Pokemon {

    private String name,weight,height,id;

    @SerializedName("base_experience")
    private String baseExperience;

    private Sprites sprites;

    ArrayList<Abilities> abilities;

    public Pokemon(String name, String weight, String height, String id, String baseExperience, Sprites sprites) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.id = id;
        this.baseExperience = baseExperience;
        this.sprites = sprites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(String baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }
}
