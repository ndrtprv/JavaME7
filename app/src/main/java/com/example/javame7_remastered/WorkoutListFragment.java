package com.example.javame7_remastered;

import android.content.Context;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

interface WorkoutListener {
    void itemClicked(int id);
}

public class WorkoutListFragment extends ListFragment {
    private WorkoutListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.listener = (WorkoutListener)context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int i;
        String [] names = new String [Workout.workouts.length];
        String [] details = new String [Workout.workouts.length];

        for (i = 0; i < names.length; i++) {
            names[i] = Workout.workouts[i].getTitle();
            details[i] = Workout.workouts[i].getDescription();
        }

        setListAdapter(new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, names));

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        listener.itemClicked(position);
    }
}