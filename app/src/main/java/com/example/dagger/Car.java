package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel){
        this.engine = engine;
        this.wheel = wheel;
    }

    @Inject
    public void remoteConnecting(Remote remote){
        remote.setlistner(this);

    }
    void implementingCar(){
        Log.d(TAG, "implementingCar: You have implemeneted");
    }
}
