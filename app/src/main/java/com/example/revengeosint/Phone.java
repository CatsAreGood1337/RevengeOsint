package com.example.revengeosint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Phone extends AppCompatActivity {
//360 52
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        Button = (Button) findViewById(R.id.button);
        Button = (Button) findViewById(R.id.button2);
        Button = (Button) findViewById(R.id.button3);
        Button = (Button) findViewById(R.id.button4);
    }

    public void onPhone1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("http://phoneradar.ru/"));
        startActivity(browserIntent);
    }

    public void onPhone2(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://phone-location.org/"));
        startActivity(browserIntent);
    }

    public void onPhone3(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://mysmsbox.ru/"));
        startActivity(browserIntent);
    }

    public void onPhone4(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://smsc.ru/testhlr/"));
        startActivity(browserIntent);
    }
}