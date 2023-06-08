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

import java.util.ArrayList;

public class Adapter_horizontal extends RecyclerView.Adapter<Adapter_horizontal.ViewHolder> {
    private Context context;
    ArrayList<MainModel> mainModels;


    public Adapter_horizontal(Context context, ArrayList<MainModel>  mainModels) {
        this.context = context;
        this.mainModels = mainModels;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView keterangan;
        ImageView image_friend;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            keterangan = itemView.findViewById(R.id.Keterangan);
            image_friend = itemView.findViewById(R.id.Img_friend);
        }
    }
    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_friend,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.image_friend.setImageResource(mainModels.get(position).getImg_friend());
        holder.keterangan.setText(mainModels.get(position).getKeterangan());

    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }
}
