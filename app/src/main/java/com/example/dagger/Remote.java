package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote(){

    }

    public void setlistner(Car car){
        Log.d(TAG, "setlistner: Remote is connected");
    }
}
