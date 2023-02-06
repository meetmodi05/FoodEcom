package com.example.foodecom;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FoodRVAdapter extends RecyclerView.Adapter<FoodRVAdapter.ViewHolder> {
    private ArrayList<VegitableModel> vegitableModelArrayList;

    public FoodRVAdapter(Screen2 screen2, ArrayList<VegitableModel> vegitableList) {
        this.vegitableModelArrayList = vegitableList;
    }

    @NonNull
    @Override
    public FoodRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRVAdapter.ViewHolder holder, int position) {
        VegitableModel vegitableModel = vegitableModelArrayList.get(position);
        holder.title.setText(vegitableModel.getTitle());
        holder.price.setText(vegitableModel.getPrice());
        holder.description.setText(vegitableModel.getDescription());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Screen3.class);
                intent.putExtra("image", vegitableModel.getImage());
                intent.putExtra("title", vegitableModel.getTitle());
                intent.putExtra("price", vegitableModel.getPrice());
                view.getContext().startActivity(intent);

            }
        });
        holder.food_img.setImageResource(vegitableModelArrayList.get(position).getImage());
        Glide.with(holder.food_img).load(vegitableModel.getImage()).circleCrop().override(312, 312).into(holder.food_img);
    }

    @Override
    public int getItemCount() {
        return vegitableModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, price, description;
        private ImageView food_img;
        private CardView cardView;

        public ViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            price = view.findViewById(R.id.price);
            description = view.findViewById(R.id.description);
            cardView = view.findViewById(R.id.cv1);
            food_img = view.findViewById(R.id.item_img);
        }
    }
}
