package com.cal.myapplication;

// 10120772
// Mochamad Aqshal Firizki
// IF-9
// 25 Mei 2023

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_gallery extends RecyclerView.Adapter<Adapter_gallery.ViewHolder>  {

    private Context c;
    int[] arr;
    String[] title;

    private LayoutInflater mInflater;

    ImageView imageView;
    TextView textView;

    public Adapter_gallery(@NonNull Context context, String[] title,int[] arr) {
        this.mInflater = LayoutInflater.from(context);
        this.c = context;
        this.title = title;
        this.arr = arr;
    }

    // inflates the row layout from xml when needed
    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_gallery, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the view and textview in each row
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(arr[position]);
        holder.textView.setText(title[position]);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_gallery);
            textView=itemView.findViewById(R.id.text_gallery);

        }
    }

}