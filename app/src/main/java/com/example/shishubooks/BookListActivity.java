package com.example.shishubooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BookListActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        listView = findViewById(R.id.listviewbooklist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        final String[] classnames = getResources().getStringArray(R.array.class_name);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(BookListActivity.this,R.layout.booklist_layout,R.id.booklist_layout_t1,classnames);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(BookListActivity.this,ClassOneBooksActivity.class);
                    startActivity(intent);

                }else if (position==1){
                    Intent intent = new Intent(BookListActivity.this,ClassOneBooksActivity.class);
                    startActivity(intent);
                }else if (position==2){
                    Intent intent = new Intent(BookListActivity.this,ClassOneBooksActivity.class);
                    startActivity(intent);
                }else if (position==3){
                    Intent intent = new Intent(BookListActivity.this,ClassOneBooksActivity.class);
                    startActivity(intent);

                }else if (position==4){
                    Intent intent = new Intent(BookListActivity.this,ClassOneBooksActivity.class);
                    startActivity(intent);

                }else if (position==5){
                    Intent intent = new Intent(BookListActivity.this,ClassOneBooksActivity.class);
                    startActivity(intent);

                }else if (position==6){
                    Intent intent = new Intent(BookListActivity.this,ClassOneBooksActivity.class);
                    startActivity(intent);

                }
            }
        });
    }
}