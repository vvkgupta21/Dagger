package com.example.dagger;

public class Wheel {

    // we don't own this class So no need to annotate this with @Inject

    private Rim rim;
    private Tires tires;

    public Wheel(Rim rim, Tires tires){

        this.rim = rim;
        this.tires = tires;

    }
}
