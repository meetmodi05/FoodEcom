package com.example.foodecom;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Screen3 extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<ImageModel> imageModelArrayList;

    TextView tv_desc, tv_title, tv_price;
    ImageView iv_back;
    ListView lvpros;
    String title, price;
    ProsModel prosModel;
    ConsModel consModel;
    ArrayList<ProsModel> prosModelArrayList;
    ArrayList<ConsModel> consModelArrayList;

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
        lvpros = findViewById(R.id.lvpros);

//        imageModelArrayList = new ArrayList<>();
//        imageModelArrayList.add(new ImageModel(R.drawable.food));
//        imageModelArrayList.add(new ImageModel(R.drawable.sandwich));
//        imageModelArrayList.add(new ImageModel(R.drawable.vegfood));
//        ImageAdapter imageAdapter = new ImageAdapter(this, imageModelArrayList);
//        viewPager.setAdapter(imageAdapter);

        title = getIntent().getStringExtra("title");
        price = getIntent().getStringExtra("price");

        tv_desc.setText(R.string.item_description);
        tv_title.setText(title);
        tv_price.setText(price);

        prosModelArrayList = new ArrayList<>();
        prosModelArrayList.add(new ProsModel(getResources().getString(R.string.pros1)));
        prosModelArrayList.add(new ProsModel(getResources().getString(R.string.pros2)));
        prosModelArrayList.add(new ProsModel(getResources().getString(R.string.pros3)));

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.pros_layout, R.id.tv_pros, prosModelArrayList);
        lvpros.setAdapter(arrayAdapter);

    }
}