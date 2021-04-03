package com.example.shishubooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BookActivity extends AppCompatActivity {

    private ImageView imageView;
    private GridView gridView;
    private ImageButton like,unlike;
    int[] bookspic = {R.drawable.one1,R.drawable.one2,R.drawable.one3,R.drawable.one4,R.drawable.one5,R.drawable.one6,R.drawable.one7};
    String[] booksname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Bundle bundle = getIntent().getExtras();
        imageView = findViewById(R.id.singlebookimg);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        if (bundle!=null){
            int value = bundle.getInt("index");
            if (value==0){
                imageView.setImageResource(R.drawable.one1);
            }else if (value==1){
                imageView.setImageResource(R.drawable.one2);
            }else if (value==2){
                imageView.setImageResource(R.drawable.one3);
            }else if (value==3){
                imageView.setImageResource(R.drawable.one4);
            }else if (value==4){
                imageView.setImageResource(R.drawable.one5);
            }else if (value==5){
                imageView.setImageResource(R.drawable.one6);
            }else if (value==6){
                imageView.setImageResource(R.drawable.one7);
            }
        }

        booksname = getResources().getStringArray(R.array.classonebooks_name);
        gridView = findViewById(R.id.bookclassonebooks);
        like = findViewById(R.id.like);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        CustomAdapter adapter = new CustomAdapter(this,booksname,bookspic);
        gridView.setAdapter(adapter);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(BookActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==1){
                    Intent intent = new Intent(BookActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);
                }else if(position==2){
                    Intent intent = new Intent(BookActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==3){
                    Intent intent = new Intent(BookActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==4){
                    Intent intent = new Intent(BookActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==5){
                    Intent intent = new Intent(BookActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }else if(position==6){
                    Intent intent = new Intent(BookActivity.this,BookActivity.class);
                    intent.putExtra("index",position);
                    startActivity(intent);

                }
            }
        });



    }
}