package com.converty.travellore;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Beach_Class extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beachlay);
        ArrayList<beach> beachlist=new ArrayList<beach>();
        beachlist.add(new beach("1.Panambur Beach","Panambur Beach is situated at a distance of 2 km from the New Mangalore Port. It is one of the famous beaches in Mangalore. New Mangalore Port is the major port of Karnataka and is a main tourist spot. Visitors can enjoy street food near the beach and also play in the waters. Every year in January, the International Kite Festival takes place in Panambur Beach. It is exciting to watch colourful kites fly over the beautiful sea.\n",R.drawable.panam));
        beachlist.add(new beach("2.Someshwara Beach","Someshwar  is a beach located in Ullal in the city of Mangalore, India.\n" +
                "\n" +
                "The name 'Someshwara beach' is derived because of Lord Somanatha temple standing since several centuries on the sea shore.[1]\n" +
                "\n" +
                "The golden sands are used for walking or sunbathing. The presence of hidden rocks and currents along this stretch of the coast make this each unsuitable for swimming. The sea claims a number of lives every year as unwary swimmers are dragged by the current.\n" +
                "\n" +
                "Close to this beach there is a hill called 'Ottinene Hill'. On reaching the top of this hill there are views of Netravati River merging and disappearing in Arabian Sea. There is lush vegetation and number of medicinal plants that are naturally grown on this hill.[1]\n",R.drawable.somu));
        beachlist.add(new beach("3.Tannir Bhavi","Tannirbhavi beach is a beach in Mangalore, Karnataka, India. It is one of the most popular tourist destinations in coastal Karnataka. Along with the beach, Sultan Battery, Tannirbavi Tree Park & the proposed Marine museum are also the tourist attractions. It can be reached either by land near Kuloor Bridge or by ferry via Gurupura river from Sultan Battery.[1]\n" +
                "\n" +
                "Tannirbhavi (also spelled as Tannirbavi) is one of the popular beaches in Mangalore city, and comes second in popularity next to Panambur beach. Tannirbhavi beach has some basic facilities like lifeguards, proper toilets, a parking lot, a couple of small eateries and concrete benches.",R.drawable.tannir));
        beachlist.add(new beach("4.Surathkal Beach","Another spot in the Mangalore city for the beach lovers. Never miss exploring this pristine location in the city. It is another clean beach that you must step in your feet. Surathkal beach is situated quite close, around 18 kms from the city of Mangalore.\n" +
                "\n" +
                "The sands are unique and smooth- it’s very powdery that you can even enjoy the location take naked footsteps. Also, don’t forget the light-house behind your back.\n" +
                "\n" +
                "Yes, it gives an enlightening view of both the ocean and the city overall. Again, it is recommended that you perform water sports or any water activities under the supervision and not alone.\n" +
                "\n",R.drawable.surat));
        beachadapter badapter=new beachadapter(this,beachlist);
        ListView listb=(ListView)findViewById(R.id.beachlist);
        listb.setAdapter(badapter);
    }
}

