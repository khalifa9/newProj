package com.example.mahmoud.newproj;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* //l'Intent pour envoyer un email a partir d'une activité
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        String[] email = new String[]{"chahtane.mahmoud@gmail.com",""};
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,"mon sujet");
        emailIntent.putExtra(Intent.EXTRA_TEXT,"mon text");
        emailIntent.setType("text/plain");
        startActivity(emailIntent);*/
        Button b;
        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            public void onClick(View v){
                Uri numTel = Uri.parse("tel:0649287360");
                Intent call = new Intent(Intent.ACTION_CALL,numTel);
                startActivity(call);
            }
        });
    }
}
