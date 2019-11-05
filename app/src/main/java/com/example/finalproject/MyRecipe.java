package com.example.finalproject;

import android.icu.text.CaseMap;

import androidx.appcompat.app.AppCompatActivity;

public class MyRecipe {
    protected long id;
    protected String URL;
    protected String TITLE;
    protected boolean favourite;

    public MyRecipe(String title, 0){

    }

    public MyRecipe(String title, long id){
        this.TITLE = title;
        this.id = id;
    }
}
