package com.example.shishubooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ClassOneBooksActivity extends AppCompatActivity {

    private GridView gridView;
    int[] bookspic = {R.drawable.one1,R.drawable.one2,R.drawable.one3,R.drawable.one4,R.drawable.one5,R.drawable.one6,R.drawable.one7};
    String[] booksname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_one_books);
        booksname = getResources().getStringArray(R.array.classonebooks_name);
        gridView = findViewById(R.id.classonebooks);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        CustomAdapter adapter = new CustomAdapter(this,booksname,bookspic);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(ClassOneBooksActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==1){
                    Intent intent = new Intent(ClassOneBooksActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);
                }else if(position==2){
                    Intent intent = new Intent(ClassOneBooksActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==3){
                    Intent intent = new Intent(ClassOneBooksActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==4){
                    Intent intent = new Intent(ClassOneBooksActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==5){
                    Intent intent = new Intent(ClassOneBooksActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==6){
                    Intent intent = new Intent(ClassOneBooksActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }
            }
        });


    }
}