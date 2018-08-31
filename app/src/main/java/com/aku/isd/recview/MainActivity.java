package com.aku.isd.recview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.programinglist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String [] languages = {"app", "java", "java", "java","java", "java","java", "java","java", "java","java", "java","java", "java" ,"java", "java"};
        recyclerView.setAdapter(new ProgrammingAdapter(languages));



    }
}
