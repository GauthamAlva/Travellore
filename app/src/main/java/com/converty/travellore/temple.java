package com.converty.travellore;

public class temple  {
    String minfo;
    String mheader;
    int mimg;
    public temple(String info,String header,int img){
        minfo=info;
        mheader=header;
        mimg=img;
    }
    String getinfo(){
        return minfo;
    }
    String getheader(){
        return mheader;
    }
    int  getimg(){
        return mimg;
    }
}
