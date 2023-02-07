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

public class ConsRVAdapter extends RecyclerView.Adapter<ConsRVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ConsModel> pclist;

    public ConsRVAdapter(Context context, ArrayList<ConsModel> pclist) {
        this.context = context;
        this.pclist = pclist;
    }

    @NonNull
    @Override
    public ConsRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cons_lay, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ConsRVAdapter.ViewHolder holder, int position) {
        ConsModel cModel = pclist.get(position);
        holder.tv_cons.setText(cModel.getCons());
        holder.iv_play_cons.setImageResource(pclist.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return pclist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_play_cons;
        private TextView tv_cons;

        public ViewHolder(View v) {
            super(v);
            iv_play_cons = v.findViewById(R.id.iv_play_cons);
            tv_cons = v.findViewById(R.id.tv_cons);
        }
    }
}
