package com.ninjarobot.abelardo.startfleet.entities;

import java.util.UUID;

/**
 * Created by Abelardo on 27/7/16.
 */
public class Starship {

    private UUID mId;
    private String mName;
    private String mModel;
    private String mManufacturer;

    public class Starship(){
        //Generate unique identifier
        mId = UUID.randomUUID();
    }


    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getModel() {
        return mModel;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setModel(String model) {
        mModel = model;
    }

    public void setManufacturer(String manufacturer) {
        mManufacturer = manufacturer;
    }
}
