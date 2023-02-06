package com.example.foodecom;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ProsAdapter extends ArrayAdapter<ProsModel> {
    ArrayList<ProsModel> prosModelArrayList;

    public ProsAdapter(@NonNull Context context, int resource, ArrayList<ProsModel> prosModelArrayList) {
        super(context, resource);
        this.prosModelArrayList = prosModelArrayList;
    }

}
