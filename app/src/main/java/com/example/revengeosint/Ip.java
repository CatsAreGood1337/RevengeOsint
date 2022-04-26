package com.example.revengeosint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ip extends AppCompatActivity {

    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);
        Button = (Button) findViewById(R.id.button1);
        Button = (Button) findViewById(R.id.button2);
        Button = (Button) findViewById(R.id.button3);
    }

    public void onIP1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://ipinfo.io/"));
        startActivity(browserIntent);
    }
    public void onIP2(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://ru.infobyip.com/"));
        startActivity(browserIntent);
    }
    public void onIP3(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iplocation.net/"));
        startActivity(browserIntent);
    }
}