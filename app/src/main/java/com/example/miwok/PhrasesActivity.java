package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_word);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going ?" , "minto wuksus"));
        words.add(new Word("What is your name ?" , "tinne oyaase'ne"));
        words.add(new Word("My name is..." , "oyaaset..."));
        words.add(new Word("How are you feeling ?" , "michekses?"));
        words.add(new Word("I'm feeling good." , "kuchi achit"));
        words.add(new Word("Are you coming ?" , "eenes'aa ?"));
        words.add(new Word("Yes , I'm coming." , "hee'eenem"));
        words.add(new Word("I'm coming." , "eenem"));
        words.add(new Word("Let's go" , "yoowutis"));
        words.add(new Word("Come here" , "enni'nem"));

        WordAdapter adapter = new WordAdapter(this , words , R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}