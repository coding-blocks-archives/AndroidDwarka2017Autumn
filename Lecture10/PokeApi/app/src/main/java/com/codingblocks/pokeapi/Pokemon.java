package com.codingblocks.pokeapi;

import java.util.ArrayList;

/**
 * Created by harshit on 13/10/17.
 */
public class Pokemon {

    private String name,weight,height,id,base_experience;

    private Sprites sprites;

    ArrayList<Abilities> abilities;

    public Pokemon(String name, String weight, String height, String id, String base_experience, Sprites sprites) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.id = id;
        this.base_experience = base_experience;
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

    public String getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }
}
