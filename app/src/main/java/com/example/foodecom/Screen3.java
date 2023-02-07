package com.example.foodecom;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;

public class Screen3 extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<ImageModel> imageModelArrayList;

    TextView tv_desc, tv_title, tv_price;
    WormDotsIndicator dotsIndicator;
    ImageView iv_back;
    ListView lpros, lcons;
    String title, price;
    ProsModel prosModel;
    ConsModel consModel;
    ArrayList<ProsModel> plist;
    ArrayAdapter<ProsModel> prosModelArrayAdapter;
//    ArrayList<ConsModel> consModelArrayList;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        viewPager = findViewById(R.id.viewPager);
        tv_desc = findViewById(R.id.tv_desc);
        tv_title = findViewById(R.id.title);
        tv_price = findViewById(R.id.price);
        iv_back = findViewById(R.id.iv_back);
        lpros = findViewById(R.id.lv_pros);
        lcons = findViewById(R.id.lv_cons);
        dotsIndicator = findViewById(R.id.worm_dots_indicator);

        imageModelArrayList = new ArrayList<>();
        imageModelArrayList.add(new ImageModel(R.drawable.food));
        imageModelArrayList.add(new ImageModel(R.drawable.sandwich));
        imageModelArrayList.add(new ImageModel(R.drawable.vegfood));
        ImageAdapter imageAdapter = new ImageAdapter(this, imageModelArrayList);
        viewPager.setAdapter(imageAdapter);
        dotsIndicator.attachTo(viewPager);

        title = getIntent().getStringExtra("title");
        price = getIntent().getStringExtra("price");

        tv_desc.setText(R.string.item_description);
        tv_title.setText(title);
        tv_price.setText(price);

        plist = new ArrayList<ProsModel>();
        plist.add(new ProsModel(getResources().getString(R.string.pros1)));
        plist.add(new ProsModel(getResources().getString(R.string.pros2)));
        plist.add(new ProsModel(getResources().getString(R.string.pros3)));

        prosModelArrayAdapter = new ArrayAdapter<>(this, R.layout.pros_layout, R.id.tv_pros, plist);
        lpros.setAdapter(prosModelArrayAdapter);
//        lcons.setAdapter(prosModelArrayAdapter);

    }
}