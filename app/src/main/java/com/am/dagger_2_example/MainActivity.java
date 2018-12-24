package com.am.dagger_2_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // This is manual Dependency injection
        Engine engine = new Engine();
        Wheels wheels = new Wheels();

        Car car = new Car(engine, wheels);
    }
}
