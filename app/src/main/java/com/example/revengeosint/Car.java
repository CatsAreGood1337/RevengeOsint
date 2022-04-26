package com.example.revengeosint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Car extends AppCompatActivity {

    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        Button = (Button) findViewById(R.id.button1);
        Button = (Button) findViewById(R.id.button2);
        Button = (Button) findViewById(R.id.button3);
    }

    public void onCar1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://vinformer.su/ident/vin.php?setLng=ru"));
        startActivity(browserIntent);
    }

    public void onCar2(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://vin01.ru/"));
        startActivity(browserIntent);
    }

    public void onCar3(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nomerogram.ru/"));
        startActivity(browserIntent);
    }
}