package com.example.nyamundapt.explorecapetown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class EventsActivity extends AppCompatActivity {
    ImageView mImage;
    TextView mFact;
    Button next;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mImage = (ImageView) findViewById(R.id.imagee);
        mFact = (TextView) findViewById(R.id.one);
        next = (Button) findViewById(R.id.next);

        showRandomFact();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomFact();
            }
        });
    }

    public void showRandomFact() {
        shuffle();
        mImage.setImageResource(factArray[0].getmImage());
        mFact.setText(factArray[0].getmFact());
    }

    private void shuffle() {
        Collections.shuffle(Arrays.asList(factArray));
    }


    facts f01 = new facts(R.drawable.lvly_tblmnt, "TABLE MOUNTAIN is a flat-topped mountain forming a prominent landmark overlooking the city of Cape Town in South Africa. It is a significant tourist attraction, with many visitors using the cableway or hiking to the top. Wikipedia\n" +
            "Elevation: 1,085 m\n" +
            "First ascent: 1503\n" +
            "Prominence: 1,055 m\n" +
            "First ascender: António de Saldanha\n" +
            "Easiest route: Platteklip Gorge\n" +
            "Did you know: Table Mountain is older than the Andes, the Alps, the Rocky Mountains and the Himalayas");
    facts f02 = new facts(R.drawable.jonkershoek, "JONKERSHOEK NATURE RESERVE is a CapeNature nature reserve located approximately 10 km south-east of the town of Stellenbosch in the Western Cape province of South Africa. It covers an area of approximately 11,000 hectares. Wikipedia\n" +
            "Address: Jonkershoek Rd, Stellenbosch, 7600\n" +
            "Area: 110 km²\n" +
            "Hours: Open today · 8AM–6PM\n" +
            "Phone: 021 866 1560\n" +
            "Suggest an edit\n" +
            "Plan your visit\n" +
            "People typically spend up to 3 hours here");
    facts f03 = new facts(R.drawable.robben_island, "ROBBEN ISLAND is an island in Table Bay, 6.9 km west of the coast of Bloubergstrand, Cape Town, South Africa. The name is Dutch for \"seal island.\" Wikipedia\n" +
            "Max width: 1.9 km\n" +
            "Max length: 3.3 km\n" +
            "Province: Western Cape\n" +
            "UNESCO World Heritage Site inscription: 1999\n" +
            "Did you know: For nearly 400 years, Robben Island, 12 kilometres from Cape Town, was a place of banishment, exile, isolation and imprisonment. sa-venues.com");
    facts f04 = new facts(R.drawable.two_oceans, "THE TWO OCEANS AQUARIUM is an aquarium located at the Victoria & Alfred Waterfront in Cape Town, Western Cape, South Africa. Wikipedia\n" +
            "Address: Dock Rd, V & A Waterfront, Cape Town, 8002\n" +
            "Opened: 13 November 1995\n" +
            "Hours: Open today · 9:30AM–6PM\n" +
            "Phone: 021 418 3823\n" +
            "Public transit access: MyCiTi\n" +
            "Volume of largest tank: 2,000,000 l (440,000 imp gal; 530,000 US gal)\n" +
            "Owner: V&A Waterfront Holdings (Pty) Limited and Investec Bank\n" +
            "Suggest an edit\n" +
            "Popular times\n" +
            "9a\n" +
            "12p\n" +
            "3p\n" +
            "6p\n" +
            "9p\n" +
            "Plan your visit: People typically spend up to 45 min here\n" +
            "Add a photo\n" +
            "Write a review\n" +
            "Reviews\n" +
            "958 Google reviews\n" +
            "Modern indoor aquarium & conservation center offering close encounters with sharks & penguins. - Google");
    facts f05 = new facts(R.drawable.lion, "LION'S HEAD is a mountain in Cape Town, South Africa, between Table Mountain and Signal Hill. Lion's Head peaks at 669 metres above sea level. Wikipedia\n" +
            "Elevation: 669 m\n" +
            "Prominence: 420 m\n" +
            "Location: Western Cape, South Africa\n" +
            "Easiest route: Hiking\n" +
            "Age of rock: Silurian/Ordovician");
    facts f06 = new facts(R.drawable.dstsx, "DISTRICT SIX MUSEUM is a museum in the former inner-city residential area, District Six, in Cape Town, South Africa. Wikipedia\n" +
            "Address: 25A Albertus St & Buitenkant Street, Zonnebloem, Cape Town, 8000\n" +
            "Hours: Open today · 9AM–4PM\n" +
            "Phone: 021 466 7200\n" +
            "Founded: 1994\n" +
            "Function: Museum\n" +
            "Suggest an edit · Own this business?\n" +
            "Popular times\n" +
            "9a\n" +
            "12p\n" +
            "3p\n" +
            "6p\n" +
            "9p\n" +
            "Plan your visit: People typically spend up to 1,5 hours here\n" +
            "Add a photo\n" +
            "Write a review\n" +
            "Reviews\n" +
            "168 Google reviews\n" +
            "Museum tracing the 1970s forced clearance of 60,000 residents & demolition of homes under apartheid. - Google");
    facts f07 = new facts(R.drawable.artgall, "The IZIKO SOUTH AFRICAN NATIONAL GALLERY is the national art gallery of South Africa located in Cape Town. It became part of the Iziko collection of museums - as managed by the Department of Arts and Culture - in 2001. Wikipedia\n" +
            "Address: Government Ave, Company's Garden, Cape Town, 8000\n" +
            "Hours: Open today · 10AM–5PM\n" +
            "Phone: 021 481 3970\n" +
            "Date founded: 3 November 1930\n" +
            "Artworks: Interior, Portrait of a four-year old boy with a club and ball\n" +
            "Suggest an edit · Own this business?\n" +
            "Popular times\n" +
            "9a\n" +
            "12p\n" +
            "3p\n" +
            "6p\n" +
            "9p\n" +
            "Plan your visit: People typically spend up to 1,5 hours here\n" +
            "Add a photo\n" +
            "Write a review\n" +
            "Reviews\n" +
            "53 Google reviews\n" +
            "South Africa's top international art collection, with South African, African & European works. - Google");
    facts f08 = new facts(R.drawable.arderne_gardens, "ARDERNE GARDENS is a public park and arboretum in Claremont, Cape Town, located in the Western Cape of South Africa. It was established by in 1845 by Ralph Henry Arderne, a timber merchant originally from Cheshire, England. Wikipedia\n" +
            "Address: 222 Main Rd, Claremont, 7708\n" +
            "Hours: Open today · 8AM–6PM\n" +
            "Phone: 021 444 1692\n" +
            "Suggest an edit\n" +
            "Plan your visit\n" +
            "People typically spend up to 1 hour here\n" +
            "Add a photo\n" +
            "Write a review\n" +
            "Reviews\n" +
            "96 Google reviews\n" +
            "Tranquil arboretum with a noted collection of old, exotic trees, plus shady paths & picnic areas. ");
    facts f09= new facts(R.drawable.birds,"WORLD OF BIRDS WILDLIFE SANCTUARY AND MONKEY PARK is an avian, reptilian and wildlife sanctuary in Hout Bay, a suburb of Cape Town in South Africa. As suggested by its name, the focus is primarily on birds and monkeys. Wikipedia\n" +
            "Address: 4914 Valley Rd, Hout Bay, Cape Town, 7806\n" +
            "Area: 4 ha\n" +
            "Hours: Open today · 9AM–5PM\n" +
            "Phone: 021 790 2730\n" +
            "No. of animals: 3,000+\n" +
            "Number of species: 400\n" +
            "Suggest an edit\n" +
            "Popular times\n" +
            "Wednesdays\n" +
            "peak\n" +
            "9a\n" +
            "12p\n" +
            "3p\n" +
            "6p\n" +
            "9p   LIVE PERFORMACE\n" +
            "Plan your visit: People typically spend up to 2 hours here\n" +
            "Add a photo\n" +
            "Write a review\n" +
            "Reviews\n" +
            "259 Google reviews\n" +
            "Tropical park showcasing 400 bird species in walk-through aviaries, plus small mammals & reptiles. - Google" );
    facts f10 = new facts(R.drawable.ratanga, "RATANGA JUNCTION is an amusement park located in Century City, Cape Town in South Africa. The park opened in December 1998 as part of the development of the Century City area, adjacent to Cape Town's biggest shopping centre, Canal Walk. Wikipedia\n" +
            "Address: Cape Theme Park, Century Blvd, Century City, Cape Town, 7441\n" +
            "Opened: December 1998\n" +
            "Hours: Open today · 8AM–5PM\n" +
            "Phone: 021 206 1111\n" +
            "Suggest an edit\n" +
            "Plan your visit\n" +
            "People typically spend up to 3 hours here\n" +
            "Add a photo\n" +
            "Write a review\n" +
            "Reviews\n" +
            "601 Google reviews\n" +
            "Amusement park with 2 roller coasters, a log flume, zip lines, kiddie rides & concessions. - Google" );



    facts[] factArray = new facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };


}
