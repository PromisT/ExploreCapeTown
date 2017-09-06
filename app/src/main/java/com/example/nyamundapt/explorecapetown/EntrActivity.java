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

public class EntrActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_entr);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mImage = (ImageView) findViewById(R.id.imagee);
        mFact = (TextView) findViewById(R.id.one);
        next = (Button) findViewById(R.id.next);


        showRandomFact();

        //Picasso.with(context).load(R.drawable.cafecaprice).into(imgshopping);

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


    facts f01 = new facts(R.drawable.grandwest, "GrandWest Casino and Entertainment World\n  \nCasino gaming tables, slots & cabaret, plus kids' arcades in a vast, 24-hour entertainment complex.\n" +
            "Address: 1 Jakes Gerwel Drive, Goodwood, Cape Town, 7460\n" +
            "Phone: 021 505 7777\n" +
            "Hours: Open today · Open 24 hours\n" +
            "Neil Harrison\n" +
            "10 reviews\n" +
            "in the last weekIt's a casino. I'm not into casinos. But it's also a venue for live performances so I've been often. And it's does a good job in this respect - it's big enough for a couple of thousand people but still feels intimate. There's also an ice rink here and my friends who have kids visit regularly - then again it's the only ice rink in Cape Town. There are some reasonable restaurants and a cinema complex too. I can't tell you anything about the casino. I'm not into casinos.\n" +
            "Helpful?\n" +
            "Elaine Page\n" +
            "Elaine Page\n" +
            "Local Guide · 30 reviews\n" +
            "a month ago-\n" +
            "Very safe place to visit with kids. Entertainment centre for kids very good. Ice skating facility excellent. Lots of gambling machines and tables. Does not pay that well at the Casino though. Eating facilities great. Ten pin bowling facilities. Lots of shows and also Hillsong church functions. Love the diversity of services offered. \n");
    facts f02 = new facts(R.drawable.open_air, "Galileo Open Air Cinema, Kirstenbosch\n  \nAddress: 0A Rhodes Dr, Wynberg NU (2), Cape Town, 7800\n" +
            "\nThe Galileo Open Air Cinema welcomes you to a magical movie experience of cinematic delights, tantalizing treats and breath-taking scenery under a canopy of stars.\n" +
            "\n" +
            "At The Galileo, when the sun sets the stars really come out, with a glittering line-up of romantic comedies, cult classics, musicals, adventure sports and documentaries that let you cuddle up and be entertained.\n" +
            "\n" +
            "Every event is a unique experience that starts at 6pm on weekdays, 5pm on Saturdays and 4pm on Sundays. The doors swing open to a festive market of mouth-watering artisanal food and drinks on sale, interactive games, lively music and an unforgettable vibe.\n" +
            "\n" +
            "Running from Tuesday to Friday and selected Saturdays and Sundays, it’s the perfect setting (and excuse) for a memorable evening with friends, a ridiculously romantic date, intimate birthday party or work social.\n" +
            "\n" +
            "So don’t delay, book today to reserve your seat among the stars.\n" +
            "\n" +
            "Buy Tickets\n" +
            "\n");
    facts f03 = new facts(R.drawable.ccc, "Cape Town Comedy Club\n  \nAddress: The Pumphouse, V and A Waterfront, 6 Dock Rd, V & A Waterfront, Cape Town, 8001\n" +
            "Hours: Open today · 6PM–2AM\n" +
            "Phone: 021 418 8880\n" +
            "The seating arrangements in our 180-seater dinner theatre are handled by Cape Town Comedy Club and very often patrons have to share tables. Seating requests can be considered but not guaranteed as we also need to consider our other patrons for the night. If you have booked separately with Computicket and would like to be seated together, email us a list of all the Computicket Purchasers Names so that we can try our best to group you together. \n" +
            "“Share the laugh, share the table :-) “" +
            "The club has hosted some of the world’s most famous comedians including; Michael Mittermeier (Germany), Christopher Titus (US), Babben Larsson (Sweden), Dana Alexander (UK) and the best of the best South African stars and also hosted numerous high profile corporate events. On the 30th of March 2015, Comedy Central aired the first special “Cape Town Comedy Club presents ….”, a first of its kind for Cape Town, shot live at the Cape Town Comedy Club.\n" +
            " The brand was first created in 2005 and part of the Cape Town Festival, as a tongue in cheek “Pop up Comedy Club”. In 2007, the club then moved to the Albert Hall in Woodstock, where Kurt’s idea to provide a regular, reputable stand-up club was welcomed with open arms by Cape Town’s laugh-craving populace. Word soon spread, and Jou Ma Se Comedy Club became known as the mother of all Cape Town comedy clubs and home to some of the country’s greatest talent. The club then moved to The River Club in Observatory in 2010 until October 2013. \n" +
            "In November 2013 the brand finally found a permanent home at the beautiful historic Pumphouse in the heart of the V&A Waterfront.");
    facts f04 = new facts(R.drawable.bowling, "Lets Go Bowling\n \nAddress: Stadium on Main, Main Rd, Claremont, Cape Town, 7708\n" +
            "Hours: Open today · 9AM–10PM\n" +
            "Phone: 021 671 4759\n" +
            "The Ten Pin Bowling facility, part of the “Let’s Go Bowling group, is located at The Stadium on Main Shopping Centre in Claremont, Cape Town. It is great fun for all ages with a bowling alley, licensed bar, and arcade in the same venue. Special bowling shoes can be rented and there are different balls of varying weights so no one has to miss out on the fun. The venue can be hired for corporate functions, birthday parties, and other events. \n" +
            "Let’s Go Bowling at Stadium on Main also hosts Karaoke night every Wednesday from 19:00.\n" +
            "Let's Go Bowling Claremont , the ideal venue for family entertainment, kids parties & Teambuilding ! " +
            "Offering Tenpin, Mini Golf, Crafties Lounge\n" +
            "Lets Go Bowling maintain and manage bowling centres that are safe and friendly while keeping to the strict international standards that regulate the sport of ten-pin bowling. All equipment and lanes are of the highest international quality.\n" +
            "\n" +
            "The centre also offer video games, pool table, lounges to create an all round entertainment experience. We also run local, national and international tournaments and competitions and Kiddies parties are available. Please enquire.");
    facts f05 = new facts(R.drawable.sharks2, "9 Kus Drive | Kleinbaai | Gansbaai | +27 (0) 82 559 6858 \ninfo@sharkcagediving.co.za | www.sharkcagediving.co.za\nAre you looking for a once-in-a-lifetime thrill? The sort-of adrenaline-pumped bucket-list activity that quickens your breath and weakens your knees giving you that tiptoeing-the-cliff-edge kind-of buzz? If so, then we might just have the exact exhilarating life-affirming adventure you’ve been looking for…\n" +
            "Great White Shark Cage Diving.\n" +
            "That’s right; why not take an up-close-and-personal dip in great white shark-infested waters with White Shark Diving Company (WSDC), which specialises in underwater adventures that showcase the kings of the deep in their natural habitat? Dive into the wild, and toothy, side of life and swim with one of the Atlantic’s most majestic, and rather misunderstood, \n" +
            "sea-creatures all from the comfort of inside a strong steel cage, of course.\n" +
            "Please Bring Along:\n" +
            "Sunscreen (preferably waterproof)\n" +
            "Bathing costume and towel\n" +
            "Hat or cap\n" +
            "Warm jacket\n" +
            "Camera (optional)");
    facts f06 = new facts(R.drawable.bike_park, "THE BIKE PARK\n  \nAddress: ERF3347 Spaanschemat River Rd, Porter Reform Estate, Cape Town, 7806\n" +
            "Hours: Open today · 8AM–6PM\n" +
            "Phone: 081 833 4488\n" +
            "Open 7 days a week, from 8am until 6pm, the Bike Park at Constantia Uitsig offers cyclists of all ages and skill levels laps and laps of fun.\n" +
            "\n" +
            "Featuring a variety of pump tracks currently totaling 2.8 kms, there are beginner jump lines all the way to expert drop-offs, rock gardens, a wooden berm, rollers and a suspension sky bridge (that tracks the canopy of the trees) ending in a corkscrew exit.\n" +
            "In addition to the new Bike Barn – which offers spectators a cozy hideout and cyclists, a pitstop with bike repair facilities on site – there will also be a dual slalom race track soon.\n" +
            "\n" +
            "Designed by Downhill World Champion, Chris Nixon, the tracks are ideal for honing one’s bike handling skills. BMX’s, mountain bikes and cyclocross are all welcome.\n" +
            "\n" +
            "Entry fee: R65 per day (no charge for spectators) or R750 per year. There is a special R40 off-peak charge between 8-9am daily. A card machine is on the premises.\n" +
            "\n" +
            "Visit our website: www.bikeparkatuitsig.co.za or contact 081 833 4488 | chris@chrisnixon.co.za for more information.");
    facts f07 = new facts(R.drawable.deco_night, "DECO DANCE NIGHT CLUB\n" +"120B Main Road | Sea Point | Cape Town | +27 (0)21 433 2912"+
            "his is where we go when we want to dance to music we recognise without the masses of teenagers that Claremont seems to attract. The over 22 age limit seems to take care of that. Originally in Woodstock, Decodance now calls Sea Point home. Descending the stairs can be tricky after you’ve had a few so do what we did and get there early for a few drinks before the dancefloor fills up \n" +
            "(plus they only start charging entrance at 10pm).\n" +
            "There are two sections, the smoking and non-smoking, each with their own dancefloor and bar. Tired from dancing to the mix of 60s, 70s and 80s music we make our way to the bar. They stock all the usual suspects but it’s the toffee vodka that we’re after.\n" +
            "We leave the haze of the smoking section and grab a table in the mid-section of the club. The non-smoking section is also starting to fill up, but the aircon keeps the dancefloor from getting too hot and sweaty. (There’s also a can of deodorant in the girls' bathroom in case anyone needs freshening up.)\n" +
            "\n" +
            "The venue is spacious and the tables provide a nice place to rest in-between dancing, but what really makes Decodance is the music. The DJ is playing a mix of pop, rock and dance music that contains all the cheesy goodness of the last couple of decades.\n" +
            " It’s really fun music to sing along with and dance to without taking yourself too seriously.\n" +
            "Opening times:  Fridays - Saturdays: 8:30pm – 4am");
    facts f08 = new facts(R.drawable.cafecaprice, "CAFE CAPRICE\n  \nRelaxed, split-level, all-day cafe facing beach, with eclectic menu, cocktails and sidewalk tables.\n" +
            "Address: 37 Victoria Rd, Camps Bay, Cape Town, 8005\n" +
            "Hours: Open today · 9:30AM–2AM\n" +
            "Phone: 021 438 8315\n" +
            "Café Caprice combines artisan cocktails, a café-style menu, relaxing lounges and sidewalk seating to experience the epitome of Cape Town’s cosmopolitan social scene. Situated directly across from Camps Bay Beach at 37 Victoria Road, open 7 days a week since 1999, it is a home for many Cape Townians and a must visit destination for tourists.\n" +
            "Camps Bay beach is the ultimate sunset viewing spot and Café Caprice provides the perfect backdrop, as DJ’s fill the space with laid back music from Thursday to Sunday with a deep, chilled house soundtrack.\n" +
            "Café Caprice – a landmark on the Camps Bay promenade and an indelible part of the Cape Town bar and entertainment scene.\n" +
            "Where Santorini has Theros and Dubai has Barasti, Cape Town’s got Café Caprice. Since the dapper venue opened in 2001 just a seagull’s flap away from Camps Bay’s sandy shores, it has evolved into an icon of the Mother City’s social scene, with a reputation that’s sexy enough to position it right up there alongside other world-class international beach bars.\n" +
            "Foreign visitors tend to consider the laidback hangout as much of a Cape Town must-do as climbing Table Mountain or scouting out penguins at Boulders Beach, and locals know it for its sultry summer Sunday soirées, its magnetic effect on the in-crowd and its views of, what co-owner David Raad refers to as, “the most incredible sunsets in Africa”. But there are many other faces of Café Caprice that only its regulars are truly au fait with.");
    facts f09 = new facts(R.drawable.shimmy, "SHIMMY BEACH CLUB\n  \nSeaside complex with outdoor restaurant serving sushi, pizza and steak, plus bar, pool and music.\n" +
            "Address: 12 S Arm Rd, V & A Waterfront, Cape Town, 8002\n" +
            "Phone: 021 200 7778\n" +
            "Hours: Open today · 11AM–11PM\n" +
            "Suggest an edit\n" +
            "Shimmy Beach Club is Cape Town’s premier ocean-front dining and lifestyle venue. When you shimmy down to our spectacular location fronting the harbour with its breathtaking backdrop of Cape Town’s iconic Table Mountain, you’ll discover a destination with endless opportunity for luxury and indulgence. Savour our delectable menus, taste our numerous luxury drinks and cocktails, and imbibe the sophisticated environment we’ve created just for you.\n" +
            "Reviewed on tripadvisor.co.za\n" +
            "TripAdvisor\n" +
            "Voted Cape Town’s Best Club by Zomato users in, for its design and location.\n" +
            "\n" +
            "Situated in the V&A Waterfront, with an elegant 220-seater restaurant, two meeting rooms and a private beach, Shimmy Beach Club is the perfect restaurant venue for family meals, conferences or large corporate events.\n" +
            "\n" +
            "Our winter trading hours are from Wednesday to Saturday from 11:00 to 04:00 at the latest, and Sunday 11:00 to 02:00, with our kitchen closing at 23:00.\n" +
            "Join us at Shimmy for the ultimate Beach Club experience, where lively Ibiza meets laid back Cape Town in a frenzy of style, sophistication and premium entertainment.\n" +
            "\n" +
            "Bring the family for a meal in our ocean-facing restaurant, spend your day lazing on our private beach and take a swim in the infinity pool overlooking the Atlantic.  Ease your way into the night with the sounds of the best in local and international DJs, and if you’d like to treat yourself, book your very own VIP area and we’ll make sure to tailor your experience.\n" +
            "\n" +
            "Our various facilities are available for conferencing, team meetings, cocktail parties and more!\n" +
            "\n" +
            "Our winter trading hours are from Wednesday to Saturday from 11:00 to 04:00 at the latest, and Sunday 11:00 to 02:00, with our kitchen closing at 23:00.\n" +
            "\n" );
    facts f10 = new facts(R.drawable.wine_tasting, "CONSTANTIA UITSIG WINE FARMS\n   \nConstantia Uitsig, Spaanchemat River Road, Constantia, Cape Town\n" +
            "+27 (0)21 794 6500\n" +
            "www.uitsig.co.za\n" +
            "wine@uitsig.co.za" +
            "Constantia’s history dates back to 1685 when Simon van der Stel named his property after the daughter of the benefactor who granted him a farm nestled beneath a picturesque mountain range. The lush setting and moderate temperatures of Constantia Uitsig bode well for farming and van der Stel set to work planting orchards and vineyards.\n" +
            "\n" +
            "Constantia is thus the oldest wine-producing region in the Southern Hemisphere – with an uninterrupted history of wine making that spans over 300 years.\n" +
            "\n" +
            "Having subsequently been subdivided into smaller farms, Constantia Uitsig is now one of a select handful of wine estates that together make up the Constantia Valley Wine Route.\n" +
            "\n" +
            "There’s no denying that Constantia Uitsig has a long and rich heritage behind it. But it’s the prospect of what lies ahead that burns brightest in our hearts – not simply in the years to come, but in the generations to come too.\n" +
            "Wine tastings are by appointment only, at a cost of R50.00 per person. This season, we will be showcasing the following five wines in our tasting sessions: MCC 2012, Red Horizon 2012, Constantia White 2013, Semillon 2014, Unwooded Chardonnay 2014.\n" +
            "\n" +
            "Open 5 days a week, Wednesdays through to Sundays from 10h00 to 18h00, our temporary wine shop marries rustic charm with warm hospitality.\n" +
            "\n" +
            "The Wine Shop is also proud to stock goods from Brenda’s Deli.");


    facts[] factArray = new facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10

    };


}
