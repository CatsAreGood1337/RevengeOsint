package com.example.revengeosint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tgbots extends AppCompatActivity {

    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgbots);
        Button = (Button) findViewById(R.id.button1);
        Button = (Button) findViewById(R.id.button2);
        Button = (Button) findViewById(R.id.button3);
        Button = (Button) findViewById(R.id.button4);
    }

    public void onTG1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/asaverobot"));
        startActivity(browserIntent);
    }
    public void onTG2(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/avoicerobot"));
        startActivity(browserIntent);
    }
    public void onTG3(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/getcontact_real_bot"));
        startActivity(browserIntent);
    }
    public void onTG4(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/@userinfobot"));
        startActivity(browserIntent);
    }
}