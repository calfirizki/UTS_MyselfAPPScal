package com.cal.myapplication;

// 10120772
// Mochamad Aqshal Firizki
// IF-9
// 25 Mei 2023

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryFragment extends Fragment {
    String title[] = {"Gunung", "Pantai", "Tournament", "Tournament ", "Villa","Gunung"};
    int arr[] = {R.drawable.gunung, R.drawable.pantai, R.drawable.pubgg, R.drawable.pubg2, R.drawable.villa, R.drawable.calprof};
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView = rootView.findViewById(R.id.list_gallery);
        layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        Adapter_gallery adapter_gallery = new Adapter_gallery(getActivity(),title,arr);
        recyclerView.setAdapter(adapter_gallery);
        return rootView;
    }
}
