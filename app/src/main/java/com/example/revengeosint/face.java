package com.example.revengeosint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class face extends AppCompatActivity {

    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);
        Button = (Button) findViewById(R.id.button1);
        Button = (Button) findViewById(R.id.button2);
    }

    public void onFace1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.betafaceapi.com/demo.html"));
        startActivity(browserIntent);
    }
    public void onFace2(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.watch/"));
        startActivity(browserIntent);
    }
}