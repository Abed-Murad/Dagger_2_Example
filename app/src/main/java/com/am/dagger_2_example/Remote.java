package com.am.dagger_2_example;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    public static final String TAG = "Car";

    @Inject
    public Remote() {

    }
    public void setListener(Car car) {
        Log.d(TAG, "Remote Connected");
    }
}
