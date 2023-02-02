package com.example.foodecom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.GenericLifecycleObserver;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
ImageView mainbgiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainbgiv=findViewById(R.id.main_bg_img);
//        Glide.with(this).load(getDrawable(R.drawable.logo)).circleCrop().override(245,301).into(mainbgiv);

    }
}