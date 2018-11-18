package com.jombloxjones.www.biology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button tekan;
    EditText user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setup();
    }

    public void setup(){
        tekan=(Button)findViewById(R.id.logbut);
        user=(EditText)findViewById(R.id.user);
    }

    public void cobaMasuk (View view){
        Intent berhasilLogin= new Intent(LoginActivity.this,MainActivity.class);
        startActivity(berhasilLogin);
        Toast.makeText(LoginActivity.this,"Selamat Datang",Toast.LENGTH_SHORT).show();
    }


}
