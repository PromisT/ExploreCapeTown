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

public class InfoActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_info);

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


    facts f01 = new facts(R.drawable.atlanticseaboard, "CAPE TOWN LODGE HOTEL,\n4-star Hotel    R613,\n \nAddress: 101 Buitengracht St, Cape Town City Centre, \nCape Town, 8001 \nPhone: 021 422 0030 \n  " +
            "\nSet 6 km from Table Mountain, this modern Downtown hotel is 4 km from the Victoria & Alfred Waterfront and 13 km from Kirstenbosch National Botanical Garden. The warmly decorated rooms provide Wi-Fi (fee), flat-screen TVs and minibars, as well as tea and coffeemaking facilities. \n" +
            "\nThe refined suites add living areas, while top-floor apartments with city views include kitchenettes, and living and dining areas. Room service is available. \n" +
            "\nAmenities include a grill restaurant, a bar and a rooftop pool. There's also a fitness centre and underground parking. \n" +
            "\nReview summary \n" +
            "\nRooms·3,4 " +
            "\nGuests liked the large, clean rooms, though some said they were dated & maintenance could be improved·Guests liked the comfortable beds·Some guests said the bathrooms were small \n" +
            "\nLocation·4,0 " +
            "\nNear the city center; sightseeing, restaurants & bars nearby \n" +
            "\nService & facilities·3,7 " +
            "\nGuests appreciated the friendly, professional staff·Some guests said management could be improved");

    facts f02 = new facts(R.drawable.lagoon,"LAGOON BEACH HOTEL,\n 4-star hotel    R1556,\n  \nAddress: 1 Lagoon Gate Drive, Lagoon Beach, Cape Town, 7435\n"+"\nPhone: 021 528 2000\n" +
            "\nOn a white-sand Lagoon Beach, this sophisticated hotel is 1.8 km from Milnerton Golf Club and 10.3 km from the V&A Waterfront in Cape Town's city centre. \n" +
            "\n" +
            "Posh rooms and suites come with minifridges, satellite TV, and tea and coffeemaking facilities. Upgraded quarters add ocean views; 2-bedroom apartments add full kitchens. Wi-Fi is available.\n" +
            "\n" +
            "Shuttle transportation to the V&A Waterfront is free. There are 3 restaurants, including a Thai eatery and a laid-back beach bar. Other amenities include 2 bars, a spa and direct beach access, as well as a beachside and a rooftop pool.\n"+"\nReview summary\n" +
            "\nRooms·3,3\n" +
            "\nRooms had views·Guests liked the large rooms, though some said they were dated & cleanliness & maintenance could be improved\n" +
            "\nLocation·4,4\n" +
            "\nNear the beach; shopping nearby·Guests noted the affordable parking\n" +
            "\nService & facilities·3,8\n" +
            "\nGuests appreciated the friendly staff·Some guests said management & housekeeping could be improved" );
    facts f03 = new facts(R.drawable.table_bay_hotel, "THE TABLE BAY HOTEL,\n5-star hotel      R3790, \nLocated in: Victoria Wharf Shopping Centre\n" +
            "Address: 6 W Quay Rd, V & A Waterfront, Cape Town,   8001\n" +
            "Phone: 021 406 5000\n" +
            "\nSet on the V&A Waterfront, this polished hotel is 4 km   from the historic Company's Garden and 9 km from Table   Mountain National Park. \n" +
            "\n" +
            "Elegant rooms feature views of the harbour or Table   Mountain, plus free Wi-Fi, flat-screens, writing desks, and   tea and coffeemaking equipment. Suites add living rooms;   some have whirlpool baths. Turndown service is provided,   and 24-hour room service is on offer.\n" +
            "\n" +
            "Complimentary perks include breakfast and local shuttle   service. There's a chic brasserie, a clubby bar, and a   ballroom, plus a genteel lounge offering high tea and   harbour views. Other amenities include an outdoor pool, a   poolside bar, a gym and a spa.\n"+"\n  Review summary\n" +
            "\nRooms·3,8\n" +
            "Rooms had views·Guests liked the large rooms, though   some said they were dated & cleanliness & maintenance   could be improved·Some guests mentioned bathroom   cleanliness could be improved\n" +
            "\nLocation·4,9\n" +
            "Shopping, sightseeing, restaurants & bars   nearby·Parking available\n" +
            "\nService & facilities·4,1\n" +
            "Guests appreciated the friendly, professional   staff·Guests spoke highly of the reception staff,   though some said housekeeping could be improved");
    facts f04 = new facts(R.drawable.taj, "TAJ CAPE TOWN,\n5-star hotel    R3670\n  \nAddress: 1 Wale St, Cape Town City Centre, Cape Town, 8000\n" +
            "Phone: 021 819 2000\n" +
            "\nThis refined hotel is set across a modern tower, a 19th-century office block and a 1932 bank, and is an 8-minute walk from Cape Town train station. \n" +
            "\n" +
            "Elegant rooms come with minibars, free Wi-Fi, iPod docks and smart TVs. Some present high ceilings or private balconies. Suites add lounges and butler service. A 2-floor penthouse suite offers views of Table Mountain, plus a gym and a steam room. Suite and club-room guests have access to a lounge with free breakfast, high tea and evening cocktails. Room service is offered.\n" +
            "\n" +
            "Dining options include 3 restaurants and a lobby lounge. There's also an Ayurvedic spa, a fitness centre and an indoor pool.\n"+"\nReview summary\n" +
            "\nRooms·4,4\n" +
            "Guests liked the large, clean rooms·Guests liked the comfortable beds·Guests appreciated the large bathrooms\n" +
            "\nLocation·4,8\n" +
            "Shopping, sightseeing, restaurants & bars nearby\n" +
            "\nService & facilities·4,5\n" +
            "Guests appreciated the friendly, professional staff·Guests spoke highly of the reception staff·Guests enjoyed the sauna & fitness center");
    facts f05 = new facts(R.drawable.thebayhotel, "THE BAY HOTEL,\n5-star hotel    R1573\n,\n  \nAddress: 69 Victoria St, Camps Bay, Cape Town, 8001\n" +
            "Phone: 021 430 4444\n" +
            "\nThis upmarket beachside hotel is 6.2 km from the Table   Mountain Nature Reserve and 7 km from the Green Point   Lighthouse. \n" +
            "\n" +
            "The airy rooms and suites have a casual-chic style,   many with ocean views. All have air-conditioning, free Wi-  Fi, flat-screens, iPod docks, and tea and coffeemaking   equipment. Many have private patios, and upgraded   rooms add whirlpool tubs.\n" +
            "\n" +
            "Free breakfast is served in the bright restaurant. The   glass-enclosed bistro offers sea views, and there's an   intimate bar and lounge. Other facilities include heated   outdoor pools with poolside bars, a spa, a salon and   a gym. Meeting facilities and private parking (fee) are   available.\n"+"\nReview summary\n" +
            "\nRooms·3,7\n" +
            "Rooms had views·Guests liked the large rooms, though   some said they were dated & maintenance could be   improved\n" +
            "\nLocation·4,7\n" +
            "Near the beach; restaurants & bars nearby\n" +
            "\nService & facilities·3,7\n" +
            "Guests appreciated the friendly staff·Some guests said   housekeeping could be improved");
    facts f06 = new facts(R.drawable.commodore, "THE COMMODORE HOTEL,\n4-star hotel    R2065,\n  \nAddress: Portswood Rd, V&A Waterfront, Cape Town, 8002\n" +
            "\nPhone: 021 415 1000\n" +
            "\nA 4-minute walk from shopping and entertainment at the V&A Waterfront, this harbour-view hotel is also an 8-minute walk from Two Oceans Aquarium and an 11-minute walk from the Cape Town Diamond Museum.\n" +
            "\n" +
            "Sleek, contemporary rooms feature minibars, desks, free Wi-Fi and flat-screen TVs, as well as tea and coffeemaking facilities. There's 24-hour room service.\n" +
            "\n" +
            "Amenities include a cocktail bar and a relaxed restaurant with a harbour-view terrace and international dishes. There's also a spa and a 24-hour gym, plus a business centre and 2 meeting rooms.\n"+"\nReview summary\n" +
            "\nRooms·2,7\n" +
            "Some guests said the rooms were dated & maintenance could be improved·Some guests mentioned bathroom cleanliness could be improved\n" +
            "\nLocation·4,9\n" +
            "Shopping, sightseeing, restaurants & bars nearby·Parking available\n" +
            "\nService & facilities·4,1\n" +
            "Guests appreciated the friendly staff");
    facts f07 = new facts(R.drawable.rhino, "HAPPY RHINO HOTEL         R540,\n  \nAddress: 179 Loop Street, City Bowl, Cape Town, 8001\n" +
            "Phone: 021 424 5092\n" +
            "\nA block from the restaurants and bars of Long Street,   this relaxed hotel in the city centre has views to Table   Mountain and Lion’s Head. It's 4 km from shopping at the   V&A Waterfront. \n" +
            "\n" +
            "Bright, modern rooms with redbrick accents offer   complimentary Wi-Fi, flat-screen TVs and USB charging   stations. All have minifridges, and tea and coffeemaking   facilities, as well as mountain and/or city views. Studios   feature living areas and kitchenettes.\n" +
            "\n" +
            "Amenities include a self-serve bar and off-street parking   (surcharge).\n"+"\nReviews\n"+"\nStaff are so friendly..   Yes it is daunting on arrival.. the   porter greets you to help with luggage... the construction   isn't helping matters and those dodgy 2 flights of stairs!!   But be assured the rooms are clean neat tidy and beds are   very comfortable.");
    facts f08 = new facts(R.drawable.gardenc, "GARDEN CENTER HOLIDAY APARTMENTS,  R1573\n  \nAddress: Mill St, Gardens, Cape Town, 8001\n" +
            "\nPhone: 021 461 8000\n" +
            "\nOverlooking Gardens Shopping Centre, these low-key apartments in a high-rise building are 7 km from Table Mountain Aerial Cableway and 8 km from the V&A Waterfront (shopping and entertainment area).\n" +
            "\n" +
            "Modest studios come with free Wi-Fi, TVs and kitchenettes, as well as city or mountain views.\n" +
            "\n" +
            "Secure parking is free, and laundry/dry-cleaning services are available.\n"+"\nReview summary\n" +
            "\nRooms·2,0\n" +
            "Rooms had views·Guests liked the large rooms, though some said they were dated & cleanliness & maintenance could be improved·Some guests mentioned bathroom cleanliness could be improved\n" +
            "\nLocation·4,7\n" +
            "Shopping nearby\n" +
            "\nService & facilities·3,8\n" +
            "Guests appreciated the friendly staff·Guests spoke highly of the reception staff");
    facts f09 = new facts(R.drawable.hgv, "HARTFIELD GUEST VILLA,\n4-star    R969,\n   \nAddress: 26 First Avenue, Claremont, Cape Town, 7708\n" +
            "Phone: 021 683 7376\n" +
            "\nSet in a residential area, this relaxed B&B is 17 km from   Table Mountain and 5 km from Kirstenbosch National   Botanical Garden. \n" +
            "\n" +
            "The 6 warmly decorated rooms and suites have free Wi-  Fi and satellite TV, plus en suite bathrooms, minibars,   and tea and coffeemaking facilities. Some add air-  conditioning, patios and/or claw-foot baths. There's also   a trio of 1-bedroom cottages with kitchenettes and private   gardens. Room service is available.\n" +
            "\n" +
            "Continental or cooked breakfast is served in a charming   dining room; dinner is provided for a fee. Other amenities   include a wine bar, complimentary secure parking, and an   outdoor pool with a deck and sunloungers.\n"+"\nReview summary\n" +
            "\nRooms·4,5\n" +
            "\nService & facilities·5,0\n" +
            "Guests appreciated the friendly staff");
    facts f10 = new facts(R.drawable.backp33, "33 SOUTH BACKPACKERS CAPE TOWN,\n4-star    R969,\n  \nAddress: 48 Trill Rd, Observatory, Cape Town, 7535\n" +
            "Phone: 021 447 2423\n" +
            "\nChill backpackers with a great atmosphere! Have fun   events every week like Braai on Fridays and a cheap   happy hour every day from 7-8pm.\n"+"  Best place to chill... with awesome boutique restaurants   and pubs, be sure to enjoy the cultural diversity of this   Backpackers and it's tranquil location \n"+"\n  Review summary\n" +
            "\nRooms·3,8\n" +
            "Guests liked the quiet rooms & comfortable beds.Some   guests mentioned the bathrooms could be improved\n" +
            "\nLocation·3,5\n" +
            "\nService & facilities·5,0\n" +
            "Guests appreciated the friendly staff");


    facts[] factArray = new facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09,f10
    };
// Picasso.with(this).load(Uri.parse(city.getMiwokimage())).into(mImage);

}
