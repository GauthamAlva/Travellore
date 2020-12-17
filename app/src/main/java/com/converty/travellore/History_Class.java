package com.converty.travellore;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class History_Class extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historylay);
        ArrayList<history> historylist=new ArrayList<history>();
        historylist.add(new history("1.SULTHAN BATTERY","Boloor is known for the watch tower constructed in the era of the emperor Tipu Sultan such that now the area surrounding the decaying structure is its namesake. The watch tower was constructed 15 years before his death in 1784 A.D. The place was previously known as Sultan's Battery (see artillery battery).\n" +
                "\n" +
                "Sultan Battery was built of black stones and constructed to obstruct war ships from entering the river which was the major route for English invasion but was then retrieved from English by Tipu Sultan. It was also used as a fort with mounting places for cannons to avoid Britishers to enter Mangalore by sea.\n" +
                "\n" +
                "There is an underground storage area under the tower that was used to store gunpowder. As per historians, this underground has secret route which leads to Mysore. Unfortunately, now it is closed and locked by Indian Tourism Authorities.\n" +
                "\n" +
                "It was the major dockyard and arsenal of the ruler. It was a naval station and was of great importance to the sultan as he used it to intercept enemy warships and prevent them from docking.\n" +
                "\n" +
                "\n" +
                "Tipu Sultan\n" +
                "If one climbs to the top of the watch tower by stairs, there is a panoramic view of Arabian Sea shows a blend of natural and man-made beauty. It is now nearly deserted with a few shacks and a boating club nearby, but it is gathering popularity among tourists.\n" +
                "\n" +
                "\n" +
                "\n",R.drawable.sultan));
        historylist.add(new history("2.Savira Kambada Basadi","Saavira Kambada Temple (Sāvira Kambada Basadi) or Tribhuvana Tilaka Cūḍāmaṇi), is a basadi or Jain temple noted for its 1000 pillars in Moodabidri, Karnataka, India. The temple is also known as \"Chandranatha Temple\" since it honors the tirthankara Chandraprabha, whose eight-foot idol is worshipped in the shrine.[1]\n" +
                "\n" +
                "The town of Moodabidri is noted for its eighteen Jain temples but Saavira Kambada Temple is considered the finest among them.[2][3]\n" +
                "The Basadi was built by the local chieftain, Devaraya Wodeyar in 1430 with additions made in 1962. The shrine has a 50 feet tall monolith manasthambha (erected by Karkala Bhairava Queen Nagala Devi\n" +
                "\n" +
                "\n",R.drawable.savira));
        historylist.add(new history("3. St.Aloysious Chappel","St. Aloysius Chapel, (Italian: Cappella di San Luigi, Portuguese: São Luís Capela) or the chapel of St. Aloysius College, is a Christian chapel in Mangalore in the state of Karnataka in southwest India. The Chapel is situated in the heart of the city on the Lighthouse Hill.\n" +
                "The St. Aloysius Chapel in Mangalore was built by Jesuit Missionaries in 1880 and its interiors painted by the Italian Jesuit Antonio Moscheni in 1899, during the Mangalore Mission in 1878. The Italian Jesuits played an important role in education, health, and social welfare of the Mangalorean Catholic community[1] and built the St. Aloysius College in 1880,[2] St Aloysius Chapel in 1884,[3] and many other institutions and churches.\n" +
                "\n" +
                "\n",R.drawable.aloy));
        historylist.add(new history("4.Bahubali(Karkala)","Bahubali (English: One With Strong Arms), a much revered figure among Jains, was the son of Rishabhanatha (the first tirthankara of Jainism) and the younger brother of Bharata Chakravartin. He is said to have meditated motionless for a year in a standing posture (kayotsarga) and that during this time, climbing plants grew around his legs. After his a year of meditation, Bahubali is said to have attained omniscience (Kevala Gyana).\n" +
                "\n" +
                "Bahubali's other names are Kammateswara, Gommateshwara because of the Gommateshwara statue dedicated to him. The statue was built by the Ganga dynasty minister and commander Chavundaraya; it is a 57-foot (17 m) monolith (statue carved from a single piece of rock) situated above a hill in Shravanabelagola in the Hassan district, Karnataka state, India. It was built circa 981 A.D. and is one of the largest free-standing statues in the world.\n",R.drawable.gomata));
        historyadapter hadapter=new historyadapter(this,historylist);
        ListView listh=(ListView) findViewById(R.id.historylist);
        listh.setAdapter(hadapter);
    }
}
