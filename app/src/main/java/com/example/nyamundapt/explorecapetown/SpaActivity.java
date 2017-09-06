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

public class SpaActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_spa);

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


    facts f01 = new facts(R.drawable.yameya,"YEMAYA SPA & HAIR SALON\n \nAddress: 76 Regent Rd, Sea Point, Cape Town, 8001\n" +
            "Hours: Open today · 8AM–8PM\n" +
            "Phone: 021 439 2266\n"+
            "acting as a one-stop shop for relaxation and rejuvenation. Though best known for offering the kind of scientifically innovative and results-driven treatments that Hollywood celebs live by (think radio frequency treatments, IPL skin rejuvenation, botox, fillers and more), the day spa also offers the more traditional treatments and basic essentials that you’d expect from most houses of beauty: massages, facials, manicures, pedicures, waxing, etc. Plus, the new spacious hair salon does everything from cuts and colours to blow-outs and extensions. ");
    facts f02 = new facts(R.drawable.dream_nails1, "DREAM NAILS BEAUTY\n  \nLocated in: Cavendish Square\n" +
            "Address: 101 Dreyer St, Claremont, Cape Town, 7708\n" +
            "Phone: 021 683 7616\n"+
            "Dream Nails gives you an opportunity to be original with your designs. This beauty salon has been in existence for over 30 years and has kept their clients happy with the professional and friendly services. Whether you choose to have your nails done or have their “dreamy massage”, it is all relaxing and rejuvenating at the beauty parlour. With nail technicians like Jacqueline Moolman (top nail technician in South Africa in 2015), it is no surprise that women all over are making regular appointments.");
    facts f03 = new facts(R.drawable.sorbet_man,"SORBET MAN\n \nAddress: 27 Somerset Rd, Cape Town, 8005\n" +
            "Hours: Open today · 9AM–5PM\n" +
            "Phone: 021 418 2261\n" +
            "Sorbet Man is the illustrious big brother of the well-known Sorbet salons in South Africa. A dudes-only destination and they don’t mess around - offering manicures, pedicures, facials, stylish cuts and body waxing. While the stylists work their magic, you can enjoy a cold beer or scotch on the rocks. Sound like the ideal man cave? Well, you will be glad to know that you can watch sports while the magicians (barbers) do all the grooming and bring out the best look to suit your lifestyle. This is also the only Sorbet Man in Cape Town.");
    facts f04 = new facts(R.drawable.spoilt_hair,"SPOILT HAIR AND NAILS\n  \nAddress: Shop 3 Portside center main road, Green Point, Cape Town, 8005\n" +
            "Hours: Open today · 8:30AM–5:30PM\n" +
            "Phone: 021 434 7112\n" +
            "This trendy hair and beauty salon is situated right next to Kluk GCDT fashion boutique so it's perfect for getting a designer outfit and making sure your hair and nails complement the look. The down-to-earth styling team has managed to create a friendly and personal vibe within the chic interior of the health spa.\n+" +
            "The Spoilt Team are an amazing bunch of talented individuals! Service and quality of work is of a high standard. I had a Micro Keratin treatment done...they treated me like a Queen! Thank you Shoneez and team! \n" +
            "Absolutely loved Spoilt and their incredible team! Superb service and the best Brazilian blow out and hair extentions I have received from any salon in Cape Town. They matched the extentions  colour perfectly to my own hair.");
    facts f05 = new facts(R.drawable.bakti,"BHAKTI BODY & BEAUTY\n  \nMain Road  Claremont  Cape Town \n" +
            "\n +27 (0)76 247 4994" +
            "Did that fatal eyebrow wax that you had two years ago traumatize you too much to go within five miles of a beauty salon? Bhakti Body & Beauty Spa offers threading, an ancient way of hair removal that originates from South Asia, using special thread to pull hair from the roots. The procedure is less painful, faster, and leaves your skin - and you - far less traumatized.");
    facts f06 = new facts(R.drawable.permanent_lips,"PERMANENT BEAUTY\n \n4 Cincaut, Veritas Estate, Buitenkant Street, Protea Heights, City Centre, Cape Town " +
            "\nPhone: +27 (0)84 736 4950" +
            "\nDuring the 1970’s, thin eyebrows were in vogue. Whilst it looked fabulous at the time, fast forward to the present day and we’re faced with 50-somethings with no eyebrows. Permanent makeup employs tattoos as a means of producing designs that resemble makeup. This means that women can wake up looking beautiful every day.");
    facts f07 = new facts(R.drawable.nail_me_up,"NAIL ME UP\n  \nAddress: 19 Verdi Blvd, Sonstraal Heights, Cape Town, 7550\n" +
            "Hours: Open today · 9AM–6PM\n" +
            "Phone: 072 387 0724\n" +
            "This nail salon was established to provide necessary nail treatments for your needs. The professional service provided at this beauty parlour is based on quality, care and polished results in a sophisticated home-based environment. The salon looks to consistently provide clients with the freshest styles and ideas to allow both men and women to experience rejuvenation and relaxation.");
    facts f08 = new facts(R.drawable.glasshouse,"GLASSHOUSE REJUVENATION FOR MEN\n" +
            "Address: Shop 5A.3, Silo 5, South Arm Road, V&A Waterfront, Cape Town, 8000\n" +
            "Hours: Open · 9AM–6PM\n" +
            "Phone: 021 419 9599\n" +
            "Mark Simpson coined the phrase ‘Metrosexual’, in 2002, which refers to a man who isn’t ashamed to indulge and pamper himself. Thus began a metrosexual revolution, which is fully endorsed by this Greenpoint salon. Glasshouse is a top spa where men can fine tune their appearance with teeth whitening, facials and botox.");
    facts f09 = new facts(R.drawable.chez_colleen, "CHEZ COLLEEN HEALTH & BEAUTY SALOON\n" +
            "32 Kreupelbosch Constantia Cape Town\n" +
            "Phone: +27 (0)83 528 0801\n" +
            "Are you sitting on Clifton beach eyeing women in Brazilian bikinis with envy? Why not perfect your rear end with G5 slimming at Chez Colleen? The treatment uses specialized machines to stimulate energy points. This improves blood and lymphatic circulation and makes ‘the orange peel effect’ a thing of the past. ");
    facts f10 = new facts(R.drawable.swordford,"SWORDFURN HAIR EMPORIUM\n  \nAddress: 242 Lower Main Rd, Observatory, Cape Town, 7925\n" +
            "Hours: Open today · 10AM–6PM\n" +
            "Phone: 081 538 3036\n" +
            "This trendy, unpretentious beauty and hair salon currently on Harrington Street in Cape Town’s East City (soon to move to Salt River) offers top-to-toe treatments in both the hair and beauty categories. After cutting, colouring and styling your tresses, you can get a facial, manicure, pedicure, wax, micro-needling session or massage to complete your drab-to-fab transformation. They've crafted their offerings across the board with specialised options for men, teens and tweens. Like any savvy business should be thinking they're environmentally conscious in all products used, and they strive to implement a no-chemical, \n" +
            "no-animal testing standard throughout their products, serums and lotions used in the salon. ");

    facts[] factArray = new facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };

}
