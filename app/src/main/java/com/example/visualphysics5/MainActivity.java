package com.example.visualphysics5;
import androidx.appcompat.app.AppCompatActivity;

import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.visualphysics5.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private LessonsAdapter adapter = new LessonsAdapter(new ArrayList<>());
    private int counter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        binding.recycler.setAdapter(adapter);
        binding.editButton.setOnClickListener(v->{
            addItem();
        });


    }

    private void addItem() {
        Lesson lesson = new Lesson(
                "Lesson Number #" + counter++,
                "Description of Lesson" + Math.random()
        );
        adapter.addItem(lesson);
    }
}