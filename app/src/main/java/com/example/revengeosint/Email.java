package com.example.revengeosint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class Email extends AppCompatActivity {

    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        Button = (Button) findViewById(R.id.email1);
        Button = (Button) findViewById(R.id.email2);
        Button = (Button) findViewById(R.id.email3);
        Button = (Button) findViewById(R.id.email4);
        Button = (Button) findViewById(R.id.email5);
    }

    public void onEmail1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://intelx.io/"));
        startActivity(browserIntent);
    }

    public void onEmail2(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://emailrep.io/"));
        startActivity(browserIntent);
    }

    public void onEmail3(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spiderfoot.net/"));
        startActivity(browserIntent);
    }

    public void onEmail4(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/last4mailbot"));
        startActivity(browserIntent);
    }
    
    public void onEmail5(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.emailsherlock.com/"));
        startActivity(browserIntent);
    }
}