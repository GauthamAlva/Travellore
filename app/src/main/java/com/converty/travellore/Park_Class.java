package com.converty.travellore;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Park_Class extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parklay);
        ArrayList<park> parklist = new ArrayList<park>();
        parklist.add(new park("1.Kadri Park", "Housing a wide variety of wild animals, this is the largest garden in Mangalore as well as the city's most popular picnic/jogging spot. Rare species of birds, anteaters and various other animals are seen in the animal conservatory. The park had undergone a massive renovation project which led to it being one of the most popular attractions in the city for people of all ages. It currently has a popular musical fountain show, a laser light show and also hosts flower shows throughout the year. The toy train here is a popular attraction for children as the train takes people around the park compound.\n", R.drawable.kadripark));
        parklist.add(new park("2.Ghandhi Park", "Mahatma Gandhi Park is situated near Gandhinagar, Mangaluru. It is a perfect spot for morning or evening walk. The park has children play areas, which helps kids to enjoy while playing. The park is well maintained. This park is filled with greenery and has nice seating arrangements. People come here to spend a peaceful time. This park good for both kids and adults.\n" +
                "\n", R.drawable.ghandi));
        parklist.add(new park("3.Musical Fountain", "Kadri Musical Fountain situated near Kadri, Mangaluru. This place gives a good vibe. This place helps us to relax from our busy lives. Musical Fountain is a highlight of this place. The musical show starts from 7 pm to 8 pm. It shows the history and culture aspect of Mangaluru City. The sitting space is quite wide and clean.\n", R.drawable.fountains));
        parklist.add(new park("4.Nisarga Dham", "Pilikula Nisarga Dhama (Pilikula) is a major eco-education and tourism development project promoted by the District Administration of Dakshina Kannada in the beautiful city of Mangaluru in Karnataka State, India.\n" +
                "\n" +
                "An integrated theme park with a wide variety of features, Pilikula has many attractions of cultural, educational and scientific interest. The park is spread over an area of 370 acres comprising of a tropical forest and the enchanting Pilikula Lake. The project presently includes a Biological Park, Arboretum, a Science Centre, a Lake Park with Boating Centre, a Water Amusement Park and a Golf Course. Other features which are currently being developed include a Heritage Village, an Ayurveda Health Therapy Centre and Tourist Cottages\n" +
                "\n" +
                "\n" +
                "\n", R.drawable.nisarga));
        paekadapter padapter=new paekadapter(this,parklist);
        ListView listp=(ListView)findViewById(R.id.listp);
        listp.setAdapter(padapter);
    }
}