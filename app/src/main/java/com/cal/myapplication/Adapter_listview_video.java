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

public class Adapter_listview_video extends ArrayAdapter<String> {
    Context c;
    String[] mtahun_video;
    String[] mnama_video;
    int[] mimg_video;
    LayoutInflater inflater;
    public Adapter_listview_video(@NonNull Context context, String[] mTitle, String[] mDescription, int[] mimages) {
        super(context, R.layout.list_video,mTitle);
        this.c = context;
        this.mtahun_video = mtahun_video;
        this.mnama_video = mnama_video;
        this.mimg_video = mimg_video;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_video,null);

        }
        //inisialisasi
        TextView namavideo =convertView.findViewById(R.id.nama_video);
        TextView tahunvideo = convertView.findViewById(R.id.tahun_video);
        ImageView imgvideo = (ImageView) convertView.findViewById(R.id.img_video);

        //set Text and image
        namavideo.setText(mnama_video[position]);
        tahunvideo.setText(mtahun_video[position]);
        imgvideo.setImageResource(mimg_video[position]);
        return convertView;
    }
}
