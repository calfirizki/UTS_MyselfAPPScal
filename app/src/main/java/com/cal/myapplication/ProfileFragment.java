package com.cal.myapplication;

// 10120772
// Mochamad Aqshal Firizki
// IF-9
// 25 Mei 2023

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    ImageButton wa_btn,ig_btn,map_btn,info_btn;
    String num = "6285314314893";
    String text = "Hello";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        wa_btn = rootView.findViewById(R.id.wa_btn);
        ig_btn = rootView.findViewById(R.id.ig_btn);
        map_btn = rootView.findViewById(R.id.map_btn);
        info_btn = rootView.findViewById(R.id.about_btn);


        info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(getActivity(), "AqshalFirizki merupakan aplikasi yang dibuat oleh \n Mochamad Aqshal Firizki \n 10120772\n Untuk memenuhi salah satu Tugas UTS \n Matkul AKB");
            }
        });

        wa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://api.whatsapp.com/send?phone=6281221445227="+num+"&text"+text));
                startActivity(browserIntent);
            }
        });

        ig_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/calfirizki/"));
                startActivity(browserIntent);
            }
        });
        map_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/wq9e4P6uTuQQYHQq6"));
                startActivity(browserIntent);
            }
        });
        return rootView;
    }
    private boolean isAppInstalled(String s){
        PackageManager packageManager = getActivity().getPackageManager();
        boolean is_installed;
        try {
            packageManager.getPackageInfo(s, PackageManager.GET_ACTIVITIES);
            is_installed = true;

        } catch (PackageManager.NameNotFoundException e) {
            is_installed = false;
            e.printStackTrace();
        }
        return is_installed;
    }
}