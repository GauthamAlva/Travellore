package com.converty.travellore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
private ViewFlipper imageflip;
 LinearLayout l1;
 LinearLayout l2;
 LinearLayout l3;
 LinearLayout l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageflip=(ViewFlipper)findViewById(R.id.flipper);
        int images[]={R.drawable.temple,R.drawable.beach,R.drawable.history,R.drawable.park};
        for(int img:images) {
            setImage(img);
        }
        l1=(LinearLayout) findViewById(R.id.tempid);
        l2=(LinearLayout)findViewById(R.id.bid);
        l3=(LinearLayout)findViewById(R.id.histid);
        l4=(LinearLayout)findViewById(R.id.parkid);
       l1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent1= new Intent(MainActivity.this,Temple_Class.class);
              startActivity(intent1);
           }
       });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(MainActivity.this,Beach_Class.class);
                startActivity(intent2);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(MainActivity.this,History_Class.class);
                startActivity(intent3);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4= new Intent(MainActivity.this,Park_Class.class);
                startActivity(intent4);
            }
        });
    }
    public void setImage(int img){
        ImageView image=new ImageView(this);
        image.setImageResource(img);
        imageflip.addView(image);
        imageflip.setFlipInterval(2000);
        imageflip.setAutoStart(true);
        //animations..
//        imageflip.setInAnimation(this,android.R.anim.slide_in_left);
//        imageflip.setInAnimation(this,android.R.anim.slide_out_right);
    }
}