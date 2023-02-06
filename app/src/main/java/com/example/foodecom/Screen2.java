package com.example.foodecom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Screen2 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<VegitableModel> vegitableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        recyclerView = findViewById(R.id.rview);
        vegitableList = new ArrayList<>();
        vegitableList.add(new VegitableModel(R.drawable.potato, "Potato", "₹20", R.string.item_desc));
        vegitableList.add(new VegitableModel(R.drawable.onion, "Onion", "₹20", R.string.item_desc));
        vegitableList.add(new VegitableModel(R.drawable.potato, "Potato", "₹20", R.string.item_desc));
        vegitableList.add(new VegitableModel(R.drawable.potato, "Potato", "₹20", R.string.item_desc));
        vegitableList.add(new VegitableModel(R.drawable.potato, "Potato", "₹20", R.string.item_desc));
        vegitableList.add(new VegitableModel(R.drawable.onion, "Onion", "₹20", R.string.item_desc));
        vegitableList.add(new VegitableModel(R.drawable.onion, "Onion", "₹20", R.string.item_desc));

        recyclerView.setHasFixedSize(false);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(false);
        FoodRVAdapter foodRVAdapter = new FoodRVAdapter(this, vegitableList);
        recyclerView.setAdapter(foodRVAdapter);
    }
}