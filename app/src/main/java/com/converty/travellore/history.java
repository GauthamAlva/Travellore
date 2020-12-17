package com.converty.travellore;

public class history {
    String mheader;
    String minfo;
    int mimg;
    public history(String header,String info,int img){
        mheader=header;
        minfo=info;
        mimg=img;
    }
    String getheadrer(){
        return mheader;
    }
    String getinfo(){
        return minfo;
    }
    int getimg(){
        return mimg;
    }
}
