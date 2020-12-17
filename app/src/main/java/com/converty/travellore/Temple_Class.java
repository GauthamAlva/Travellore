package com.converty.travellore;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Temple_Class extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.templelay);
        ArrayList<temple> templelist=new ArrayList<temple>();
        templelist.add(new temple("The very beautiful Kudroli Gokarnath Temple of Mangalore is one of the must-visit" +
                " religious sites of Mangalore. It was built for the Billava Community by Sri Narayan Guru as" +
                " the community members were prohibited to enter any other temple of" +
                " the region. Sri Narayan Guru was a renowned social reformer and saint from Kerala." +
                " The temple was built back in the year 1912. The idol that the temple houses are that of Gokarnanatheshwara" +
                " or Lord Shiva. The main temple along with the other temples of the surroundings are crafted in pleasing" +
                " the Tamil Nadu style of architecture. The decorations on the murals depict the several mythological " +
                "" +
                "", " 1.Kudroli Gokarnath Temple",R.drawable.kudroli));
        templelist.add(new temple("The Kadri Manjunatha Temple is another addition to the list " +
                "of religious sites that must be explored while in Mangalore." +
                " It was built back in the year 1068. The architecture of this temple is an example of a" +
                " Buddhist influence on the renowned Vijayanagar style. The temple is nestled at the base " +
                "of the mighty and lush green Kadri Hills. The main idol of the temple is that of Manjunatha." +
                " The temple is said to be created back in the 10-century or 11-century." +
                " Later, back in the 14-century, the temple was completely converted into a stone structure." +
                " The idol of Lord Manjunathaswamy that the temple houses is said to be the oldest in South India." +
                " The surroundings of the temple feature a number of small-sized ponds full of water. " +
                "The idols of a number of idols including that of Machendranath, Shringinath, Manjushri," +
                " Gorakanath, Lokeshwara, and Buddha are housed within this temple. " +
                "The northern side of the temple features a small-sized temple of Lord Ganesha while the western" +
                " side features a temple of Goddess Durga. Various festivals are celebrated here with enthusiasm." +
                " The prominent ones being Karthika Maasa," +
                " Ganesha Chaturthi, Kadiruthsava, Navrathri, and many others.","2.The Kadri Manjunatha Temple",R.drawable.kadri));
       templelist.add(new temple("Mangaladevi Temple is a temple that houses the idol of Goddess Mangaladevi, a form of Goddess Durga or Goddess Shakti. This massive temple of Durga is visited by a large number of devotees as well as tourists visiting the city each year. It is quite a popular religious site known for its brilliant architecture. Goddess Mangaladevi is said to be powerful and devotees believe that she grants the wishes of all. The temple complex is quite a massive one where the devotees and visitors can sit, meditate as well as a chant as per their desire. The peaceful feeling and divine vibe that one gets here are worth experiencing. It is said that the massive temple was built by Lord Parshuram. Within the community of the Hindus, Goddess Mangaladevi is supremely revered. The name of the city of Mangalore has also been derived from the name of this Goddess. It is believed that back in history, a princess from Malabar had given up her royal living in order to become the disciple of Saint Matsyendranath. She was renamed as Mangaladevi. When in Mangalore, she fell sick near Bolar and died. After which the locals constructed this huge temple in her honour and gave it the name of Mangaladevi Temple. The temple has been mostly built in wood and the architecture is in the South Indian style. There are various smaller shrines within the temple complex that are dedicated to various other deities. During various festivals, the upper level of the temple plays drums, which builds the festive atmosphere and spreads the spiritual cheer to all those visiting the shrine.\n" +
               "\n","3.Mangaladevi Temple",R.drawable.mangladevi));
       templelist.add(new temple("Kateel Durgaparameshwari Temple is another addition to the list of temples in Mangalore. It is one of the holiest temples in the city. The temple is nestled in the center of Nandini River on an isle amidst lush green surroundings. This unique feature of this religious site attracts a number of tourists each year. The surroundings of the temple offer serene views of the landscape, especially during the monsoon months. The temple houses the idol of Goddess Durga Parameshwari. The management team of the temple has been successful in maintaining the temple for years. There is enough vacant space available in the temple where the devotees can sit, pray, chant as well as enjoy the peaceful ambiance. Kateel Durgaparameshwari Temple makes an ideal spiritual escape for all.","4.Kateel Durgaparameshwari Temple",R.drawable.kateel));
       templelist.add(new temple("Shri Sharavu Mahaganapathi Temple is another popular temple in Mangalore dedicated to Lord Ganesha and Lord Shiva. The temple is around 800 years old and plays an essential role in the city’s religious belief system since then. The term ‘Sharavu’ means arrow and has been derived from the term ‘Shara’. The temple premises are quite clean and well maintained providing a serene ambiance to the various devotees and visitors. Although the temple is visited by devotees every day, it experiences major crowd on the occasion of various festivals like Dussehra, Sankranthi, as well as Ganesh Chaturthi. The regular prayers are attended by a number of locals and visitors with utmost devotion and enthusiasm. The aarti of the Lords is one of the most attractive features of the temple. The several rituals of the temple are always accompanied by chanting of priests and traditional instrumental music. To the south side of the complex of the temple lies the shrine of Lord Ganpati while to the western side lies the shrine of Lord Shiva. The idols of the temple are beautifully covered with silver sheets. The temple also features a sanctum sanctorum with Lord Ganesha’s images and a Shivalinga. The premises of the temple also features a sacred cow’s idol made up of stone as well as a tank. There is also an outer courtyard featured within the temple premises.","5.Shri Sharavu Mahaganapathi Temple",R.drawable.sharavu));
       templelist.add(new temple("Polali Rajarajeshwari Temple dates back to the 8-century and is dedicated to Shri Rajarajeshwari. The idol of Shri Rajeshwari is crafted using a form of clay that possesses medicinal properties. This feature of the temple attracts a number of visitors from all across the country. The architecture of the temple is worth praise with the structures of Hindu Gods done with exquisite wood as well as the roofs made with plates of copper. The temple has witnessed several renovations in the past years and has come out with a more pleasing design each time. The soothing vibe, the peaceful ambiance as well as the pull of the deity collectively attract a number of devotees to the temple. Goddess Rajarajeshwari is a form of Goddess Durga or Goddess Shakti and is considered to be the creator and destroyer of the universe. All the various Hindu festivals are celebrated here with enthusiasm the major ones being the Polali Chendu Festival as well as the Annual Festival. The fine architecture of the temple is that of the renowned South Indian Style. It is said that initially the temple was developed using molten brass and the interior of the temple also features four large platforms. The highest platform was used to install the idol of Sri Rajarajeshwari. The idol was crafted using gold and the eyes were made up of rubies. Later on, the idol was replaced by one made up of clay.","6.Polali Rajarajeshwari Temple",R.drawable.polali));


        templeadapter adapter=new templeadapter(this,templelist);
        ListView list=(ListView)findViewById(R.id.temple);
        list.setAdapter(adapter);
    }
}
