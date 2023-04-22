package com.example.javame7_remastered;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements WorkoutListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(int id) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}