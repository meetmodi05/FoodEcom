package com.example.foodecom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProsRVAdapter extends RecyclerView.Adapter<ProsRVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ProsModel> pCList;

    public ProsRVAdapter(Context context, ArrayList<ProsModel> pCList) {
        this.context = context;
        this.pCList = pCList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pros_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProsModel pCModel = pCList.get(position);
        holder.tv_pros.setText(pCModel.getPros());
        holder.iv_play.setImageResource(pCList.get(position).getIconimg());
    }


    @Override
    public int getItemCount() {
        return pCList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv_play;
        private final TextView tv_pros;

        public ViewHolder(View v) {
            super(v);
            iv_play = v.findViewById(R.id.iv_play);
            tv_pros = v.findViewById(R.id.tv_pros);
        }
    }
}
