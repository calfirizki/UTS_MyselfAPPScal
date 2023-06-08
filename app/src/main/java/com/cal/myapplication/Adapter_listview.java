package com.cal.myapplication;

// 10120772
// Mochamad Aqshal Firizki
// IF-9
// 25 Mei 2023


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter_listview extends ArrayAdapter<String> {
    Context c;
    String[] mTitle;
    String[] mDescription;
    int[] mimages;
    LayoutInflater inflater;
    public Adapter_listview(@NonNull Context context, String[] mTitle,String[] mDescription,int[] mimages) {
        super(context, R.layout.list_daily,mTitle);
        this.c = context;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mimages = mimages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_daily,null);

        }
        //inisialisasi
        TextView nama =convertView.findViewById(R.id.nama);
        TextView deskripsi = convertView.findViewById(R.id.deskripsi);
        ImageView image = (ImageView) convertView.findViewById(R.id.photo);

        //set Text and image
        nama.setText(mTitle[position]);
        deskripsi.setText(mDescription[position]);
        image.setImageResource(mimages[position]);
        return convertView;
    }
}
