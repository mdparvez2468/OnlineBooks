package com.example.shishubooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class QuizActivity extends AppCompatActivity {

    private ListView listView;
    private String[] questions;
    private String[] option1;
    private String[] option2;
    private String[] option3;
    private String[] option4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        questions = getResources().getStringArray(R.array.question);
        option1 = getResources().getStringArray(R.array.option1);
        option2 = getResources().getStringArray(R.array.option2);
        option3 = getResources().getStringArray(R.array.option3);
        option4 = getResources().getStringArray(R.array.option4);
        listView = findViewById(R.id.quiz);
        button = findViewById(R.id.submit);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        QuizAdapter adapter = new QuizAdapter(this,questions,option1,option2,option3,option4);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}