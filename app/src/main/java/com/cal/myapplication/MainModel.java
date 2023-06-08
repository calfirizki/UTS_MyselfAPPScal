package com.cal.myapplication;

// 10120772
// Mochamad Aqshal Firizki
// IF-9
// 25 Mei 2023


public class MainModel {
    Integer img_friend;
    String keterangan;

    public MainModel(Integer img_friend,String keterangan){
        this.img_friend = img_friend;
        this.keterangan = keterangan;


    }
    public Integer getImg_friend(){
        return img_friend;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
