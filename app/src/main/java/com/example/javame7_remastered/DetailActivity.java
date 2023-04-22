package com.example.javame7_remastered;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id",0);
        WorkoutDetailFragment fragment = (WorkoutDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.workoutDetail);
        if (fragment != null) {
            fragment.setWorkoutId(id);
        }
    }
}