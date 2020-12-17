package com.converty.travellore;

public class beach {
    String mheader;
    String minfo;
    int mimg;
    public beach(String header,String info,int img){
     mheader=header;
    minfo=info;
    mimg=img;}
    String getheader(){
        return mheader;
    }
    String getinfo(){
        return minfo;
    }
    int getimg(){
        return mimg;
    }
}
