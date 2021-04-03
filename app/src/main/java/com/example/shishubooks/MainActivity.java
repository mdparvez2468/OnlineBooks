package com.example.shishubooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button booklist,aboutus,quiz,videolectures,tutorials;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booklist = findViewById(R.id.booklist);
        aboutus = findViewById(R.id.aboutus);
        quiz = findViewById(R.id.quiz);
        videolectures = findViewById(R.id.videolectures);
        tutorials = findViewById(R.id.tutorials);



        booklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BookListActivity.class);
                startActivity(intent);
            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutusActivity.class);
                startActivity(intent);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        });
        videolectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,VideoLecturesActivity.class);
                startActivity(intent);
            }
        });
        tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TutorialsActivity.class);
                startActivity(intent);
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.home_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/type");
            String sub = "Online Books App";
            String body = "it's helpful to your learn";
            intent.putExtra(Intent.EXTRA_SUBJECT,sub);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share with"));
        }else if (item.getItemId()==R.id.account){
            Intent intent = new Intent(MainActivity.this,AccountActivity.class);
            startActivity(intent);
        }else if (item.getItemId()==R.id.setting){
            Intent intent = new Intent(MainActivity.this,Setting.class);
            startActivity(intent);
        }else if (item.getItemId()==R.id.feedback){
            Intent intent = new Intent(MainActivity.this,FeedBack.class);
            startActivity(intent);

        }else if (item.getItemId()==R.id.logout){
            SharedPreferences sharedPreferences = getSharedPreferences("phone", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("phonenumber","no");
            editor.putString("password","0");
            editor.commit();
            Toast.makeText(getApplicationContext(),"Logout Successfully",Toast.LENGTH_LONG).show();


        }

        return super.onOptionsItemSelected(item);
    }
}