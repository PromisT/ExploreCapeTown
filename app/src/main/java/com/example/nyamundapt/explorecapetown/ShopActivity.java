package com.example.nyamundapt.explorecapetown;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class ShopActivity extends AppCompatActivity {
    ImageView mImage;
    TextView mFact;
    Button next;
    Context context;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

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


    facts f01 = new facts(R.drawable.neighbor, "THE NEIGHBOURGOODS MARKERT \nAddress: 373 Albert Rd, Woodstock, Cape Town, 7925 \nPhone:021 458 9874 \nGreat place for street food, drinks and entertainment in Cape Town. Unfortunately my experience was ruined by a the guy at Belgische Wafels (probably the owner, hipster with a long beard,  only taking the money) who was changing his queuing policy based on his  mood or something else - avoid this place and have a crêpe instead !" +
            "\nGreat way to experience exotic food and drinks.\n" +
            "The place is usually very crowded and if you're too late the best stuff might have been sold out. However, you get a great atmosphere, delicious food and good drinks. 100% recommended!");
    facts f02 = new facts(R.drawable.panafricanmarket, "PAN AFRICAN MARKERT\n" +
            "\nAddress: 76 Long St, Cape Town City Centre, Cape Town, 8000\n"+
            "\nNice selection of African goods, but overpriced and employees extremely pushy!! It was like dealing with an annoying car salesman. My walls went up and I had to leave the place." +
            "\nGood place to shop for traditional crafts work" +
            "\nGreat gatsby type style with the music. ");
    facts f03 = new facts(R.drawable.greenmarket1, "GREENMARKERT SQUARE  \nGreenmarket Square is a historical square in the centre of old Cape Town, South Africa. The square was built in 1696, when a burgher watch house was erected. Wikipedia\n" +
             "All the things. All the vendors. They will negotiate prices, and most vendors are extremely friendly, and kind. I love the colors!! Truly all kinds of little souvenirs to bring home for your friends. The 30 or 40 Rands bracelets were a hit with my crowd.\n"+
             "Address: Burg St & Longmarket Street, Cape Town City Centre, Cape Town, 8000\n" +
            "Hours: Open  · 9AM–5PM\n" +
            "Area code: 021\n" +
            "People typically spend 15 min to 1 hr here\n");
    facts f04 = new facts(R.drawable.capq, "CAPE QUARTER LIFESTYLE VILLAGE\n  Address: 27 Somerset Rd, Green Point, Cape Town, 8005\n" +
            "Hours: Open    · 9AM–6PM\n" +
            "Phone: 021 421 1111\n"+
            "Plan your visit\n" +
            "People typically spend 15 min to 1 hr here" +
            "Reviews" +
            "Nice mall with many interesting shops, nice people and Cape Town's maybe best supermarket (a Spar branch) that offers lots of really well made salads and other good fresh stuff. All that at daytime. The issue is that in the evenings they ...More\n" +
            "a week agoSuch a central hub, the V&A Waterfront is a 2.5km walk, Cape Quarter shopping.centre has a wonderful Spar for groceries and has home cooked meals, if you want to dine in after a busy day. Artscape theater nearby and a glorious view of Table Mountain.");
      facts f05 = new facts(R.drawable.waterfront, "VICTORIA & ALFRED WATERFRONT\n  The Victoria & Alfred Waterfront in Cape Town is situated on the Atlantic shore, Table Bay Harbour, the City of Cape Town and Table Mountain. Adrian van der Vyver designed the complex. Wikipedia\n" +
              "Address: V & A Waterfront, Cape Town, 8001\n" +
              "Hours: Open  · 9AM–9PM\n" +
              "Phone: 021 408 7600\n" +
              "Ocean/sea sources: Table Bay Harbour of the Atlantic Ocean\n" +
              "Basin countries: South African\n" +
              "The Waterfront attracts more than 23 million visitors a year. wikipedia.org\n" +
              "Plan your visit\n" +
              "People typically spend 45 min to 3 hr here\n"+
              "Reviews\n"+
              "Beautiful location. Loads to see from organic market area to high end brand stores. Indoor and outdoor restaurants, aquarium is a must. Take in a movie or fine dining. Great for shopping don't have to be a tourist. Ideal if you are as it's a showcase of quality mall that SA has to offer. Good parking.\n" +
              "Excellent all in one destination that can compete with the best in the world. International shopping experience offering options to the medium and very high end market. Great international feel while maintaining the local vibe ");
      facts f06 = new facts(R.drawable.canal, "CANAL WALK \n  \nCanal Walk is a shopping centre in Cape Town, South Africa, that opened in 2000 and was built around a canal. It has a total retail area of 141,000-square-metre. Wikipedia\n" +
              "Located in: Canal Walk Shopping Centre\n" +
              "Address: Canal Walk, Century Blvd, Century City, Cape Town, 7441\n" +
              "Opened: 2000\n" +
              "Floor area: 14 ha\n" +
              "Hours: Open  · 9AM–9PM\n" +
              "Phone: 021 529 9699\n" +
              "Number of stores: 400+\n" +
              "Construction started: 2000\n"+
              "Reviews\n"+
              "One of the biggest shopping malls in Cape Town. There are a large variety of shops. The food stores and restaurants are really good. As the shops only close at 21h00 each night, there is no need to rush. Great to have the cinema right ...More\n" +
              "a week agoCan get crowded at times, but convenient when you need a variety of stores to browse at. Some good eateries too. Pretty much everything under one roof.");
    facts f07 = new facts(R.drawable.shimansky, "SHIMANSKY JEWELLERS CLOCK TOWER\n  \nAddress: Level 1, The Clock Tower, V & A Waterfront, Cape Town, 8001\n" +
            "Hours: Open   9AM–9PM\n" +
            "Phone: 021 421 2788\n"+
            "Reviews\n" +
            "Breathtaking Showroom and exceptional service. Greeted by friendly faces and 5 star service. Brilliant educational museum tour and most magnificent diamonds and jewllery pieces Cape Town has to offer. Must have experience!\n" +
            "What a great store! I have never seen such a wide selection of jewellery pieces and engagement rings to choose from. \n" +
            "Definitely the best place to go when your on the look out for the perfect ring! Thanks ladies");
    facts f08 = new facts(R.drawable.book_lounge_front, "THE BOOK LOUNGE\n  \nAddress: 71 Roeland Street, Cnr Buitenkant & Roeland Street, Cape Town, 8001\n" +
            "Hours: Open    8:30AM–7:30PM\n" +
            "Phone: 021 462 2425\n"+
            "Reviews \n" +
            "The Book Lounge is a lovely independent book shop with a wide variety of books spread across two floors. When I have needed a book that is not in stock, staff ordered it for me and sent email when it arrived.  As well as books in the ...More\n" +
            "Best bookshop in Cape Town. Staff that are knowledgeable and interested. Regular book launches and talks. Cute coffee shop and couches downstairs. \n" +
            "If you love books you'll love this charming bookshop. They have saturday morning story telling for children, nice coffee and deliciously sweet cupcakes.\n" +
            "Response from the owner\n" +
            "Thank you kindly, Andrew! We look forward to seeing you again! <3 The Book Lounge");
    facts f09 = new facts(R.drawable.baraka, "BARAKA GIFTS AND DECORE\n  \nLocated in: Cape Quarter Lifestyle Village\n" +
            "Address: Dixon St, Cape Town, 8005\n" +
            "Hours: Open   10AM–5:30PM\n" +
            "Phone: 021 425 8883\n"+
            "A treasure trove of quirky collectibles certain to captivate both visitors and locals\n" +
            "There’s no shortage of gift and decor shops in Cape Town; what’s lacking, though, is gift and decor shops with substance and heart. Baraka, which is situated in the cobbled De Waterkant district, is one of these rare jewels.\n" +
            "The tiny, overflowing store renounces all that’s tacky, generic and commercial, and so it’s a veritable blessing (the meaning of the Swahili and Arabic word ‘baraka’) not only for discerning tourists eager to take quality crafts home but also astute locals on the hunt for an out-of-the-ordinary present or a conversation-starting homeware piece. This is because the instantly likeable owners, Gavin Terblanche and Belteshazzar Raubenheimer, are deeply passionate about every item in the shop, from the tiniest tablecloth weight to the most striking scatter cushion or vintage tea set, and this sort of infectious excitement almost guarantees that customers will feel equally enthusiastic about the eclectic selection of odds and ends.");
    facts f10 = new facts(R.drawable.food_fair, "EARTH FAIR FOOD MARKET\n  \nAddress: South Palms Centre, 333 Main Rd, Cape Town, 7965" +
            "Reviews \n" +
            "The food stalls are excellent and the beer and wine selection is great. You can but fresh foods too, and on a Wednesday evening there is normally a band playing. Really worth the visit, we go there all the time!\n" +
            "Interesting, different, lots of unusual natural products. Had loads of fun strolling around in a friendly happy vibe. So worth a visit. \n" +
            "Variety of food and produce available. Good way to spend your Saturday morning with friends. \n" +
            "Decent food, typically quite pricey though as per usual market faire. Fair range of craft beers, although they could change the selection a little more (more IPA's please!!!). Nice space for kids to play. Lots of seating available. Support local!!");


            facts[] factArray = new facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };


}
