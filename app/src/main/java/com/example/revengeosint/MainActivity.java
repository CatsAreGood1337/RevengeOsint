package com.example.revengeosint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button = (Button) findViewById(R.id.Button);
        Button = (Button) findViewById(R.id.phone);
        Button = (Button) findViewById(R.id.email);
        //Button = (Button) findViewById(R.id.button1);
        //Button = (Button) findViewById(R.id.button2);
        //Button = (Button) findViewById(R.id.button3);
        //Button = (Button) findViewById(R.id.button4);
    }

    public void onTelegram(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/+rLEYY47CUyFkMTU6"));
        startActivity(browserIntent);

    }

    public void onPhone(View view) {
        switch (view.getId()) {
            case R.id.phone:
                Intent intent = new Intent(this, Phone.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

        public void onEmail(View view) {
            switch (view.getId()) {
                case R.id.email:
                    Intent intent = new Intent(this, Email.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }

    public void onIP(View view) {
        switch (view.getId()) {
            case R.id.ip:
                Intent intent = new Intent(this, Ip.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void onFace(View view) {
        switch (view.getId()) {
            case R.id.face:
                Intent intent = new Intent(this, face.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void onCar(View view) {
        switch (view.getId()) {
            case R.id.car:
                Intent intent = new Intent(this, Car.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void onBots(View view) {
        switch (view.getId()) {
            case R.id.bots:
                Intent intent = new Intent(this, tgbots.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void onCard(View view) {
        switch (view.getId()) {
            case R.id.bots:
                Intent intent = new Intent(this, card.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void onVk(View view) {
        switch (view.getId()) {
            case R.id.bots:
                Intent intent = new Intent(this, vk.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void onNacrutka(View view) {
        switch (view.getId()) {
            case R.id.bots:
                Intent intent = new Intent(this, nacrutka.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

