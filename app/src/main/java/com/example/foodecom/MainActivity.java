package com.example.foodecom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView logo_img, main_bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_img = findViewById(R.id.logo_img);
        main_bg = findViewById(R.id.main_bg);
        Glide.with(this).load(getDrawable(R.drawable.logo)).circleCrop().override(600, 650).into(logo_img);
//        Glide.with(this).load(getDrawable(R.drawable.mainbg2)).override(1000,1712).into(main_bg);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Screen2.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}