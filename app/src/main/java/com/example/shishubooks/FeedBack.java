package com.example.shishubooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedBack extends AppCompatActivity {

    private Button b1,b2;
    private EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        b1 = findViewById(R.id.feedbacksend);
        b2 = findViewById(R.id.feedbackcancel);
        e1 = findViewById(R.id.feedbackemail);
        e2 = findViewById(R.id.feedbackname);
        e3 = findViewById(R.id.feedbackmesssge);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String name = e2.getText().toString();
                String message = e3.getText().toString();
                if (email.equals("")||name.equals("")||message.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter email, name and message",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplicationContext(),"Sended",Toast.LENGTH_LONG).show();
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}