package com.example.shishubooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class AboutusActivity extends AppCompatActivity {

    private ListView listView;
    private String[] names;
    private String[] IDs;
    private String[] section;
    private String[] dpt;
    int[] personspic = {R.drawable.parvez,R.drawable.samia,R.drawable.shoshe,R.drawable.maruf,R.drawable.bonna};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        names = getResources().getStringArray(R.array.dname);
        IDs = getResources().getStringArray(R.array.did);
        section = getResources().getStringArray(R.array.dsection);
        dpt = getResources().getStringArray(R.array.ddpt);
        listView = findViewById(R.id.aboutlistid);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        AboutAdapter adapter = new AboutAdapter(this,names,IDs,section,dpt,personspic);
        listView.setAdapter(adapter);




    }
}