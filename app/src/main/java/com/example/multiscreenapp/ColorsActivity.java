package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "Weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("Mustard yellow", "Chiwiiṭә",R.drawable.color_mustard_yellow));
        words.add(new Word("Dusty yellow", "Topiisә",R.drawable.color_dusty_yellow));
        words.add(new Word("Green", "Chokokki",R.drawable.color_green));
        words.add(new Word("Brown", "Takaakki",R.drawable.color_brown));
        words.add(new Word("Gray", "Topoppi",R.drawable.color_gray));
        words.add(new Word("Black", "Kululli",R.drawable.color_black));
        words.add(new Word("White", "Kelelli",R.drawable.color_white));



        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
