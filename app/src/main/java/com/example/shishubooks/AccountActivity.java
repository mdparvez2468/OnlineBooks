package com.example.shishubooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AccountActivity extends AppCompatActivity {

    private EditText e1,e2;
    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        SharedPreferences sharedPreferences = getSharedPreferences("phone", Context.MODE_PRIVATE);
        if (sharedPreferences.contains("phonenumber")&&sharedPreferences.contains("password")){
            if (sharedPreferences.getString("phonenumber","no").equals("01736194336")&&
            sharedPreferences.getString("password","0").equals("12345")){
                Toast.makeText(getApplicationContext(),"you have already Login",Toast.LENGTH_LONG).show();
                finish();
            }
        }

        e1 = findViewById(R.id.phonenumber);
        e2 = findViewById(R.id.password);
        b1 = findViewById(R.id.forgotpassword);
        b2 = findViewById(R.id.login);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String phone = e1.getText().toString();
               String pass = e2.getText().toString();

                if (phone.equals("01736194336")&&pass.equals("12345")){
                    SharedPreferences sharedPreferences = getSharedPreferences("phone", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("phonenumber",phone);
                    editor.putString("password",pass);
                    editor.commit();
                    Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG).show();
                    finish();

                }
            }
        });
    }
}