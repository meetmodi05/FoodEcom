package com.example.foodecom;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;

public class Screen3 extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<ImageModel> imageModelArrayList;

    TextView tv_desc, tv_title, tv_price;
    WormDotsIndicator dotsIndicator;
    ImageView iv_back;
    RecyclerView rv_pros, rv_cons;
    String title, price;
    ArrayList<ProsModel> plist;
    ArrayList<ConsModel> clist;
    ArrayAdapter<String> prosModelArrayAdapter;
    ProsRVAdapter prosRVAdapter;

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
        dotsIndicator = findViewById(R.id.worm_dots_indicator);
        rv_pros = findViewById(R.id.rv_pros);
        rv_cons = findViewById(R.id.rv_cons);

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

        plist = new ArrayList<>();
        plist.add(new ProsModel(getResources().getString(R.string.pros1), R.drawable.baseline_play_arrow_24));
        plist.add(new ProsModel(getResources().getString(R.string.pros2), R.drawable.baseline_play_arrow_24));
        plist.add(new ProsModel(getResources().getString(R.string.pros3), R.drawable.baseline_play_arrow_24));
        plist.add(new ProsModel(getResources().getString(R.string.pros4), R.drawable.baseline_play_arrow_24));

        clist = new ArrayList<>();
        clist.add(new ConsModel((getResources().getString(R.string.pros1)), R.drawable.baseline_play_arrow2_24));
        clist.add(new ConsModel((getResources().getString(R.string.pros2)), R.drawable.baseline_play_arrow2_24));
        clist.add(new ConsModel((getResources().getString(R.string.pros3)), R.drawable.baseline_play_arrow2_24));
        clist.add(new ConsModel((getResources().getString(R.string.pros4)), R.drawable.baseline_play_arrow2_24));

        rv_pros.setHasFixedSize(false);
        rv_pros.setLayoutManager(new LinearLayoutManager(this));
        prosRVAdapter = new ProsRVAdapter(this, plist);
        rv_pros.setAdapter(prosRVAdapter);

        rv_cons.setLayoutManager(new LinearLayoutManager(this));
        ConsRVAdapter consRVAdapter = new ConsRVAdapter(this, clist);
        rv_cons.setAdapter(consRVAdapter);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}