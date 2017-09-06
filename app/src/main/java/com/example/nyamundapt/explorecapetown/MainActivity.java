package com.example.nyamundapt.explorecapetown;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView accomodation;
    ImageView entertainment;
    ImageView restaurant;
    ImageView shoppping;
    ImageView spa;
    ImageView events;
    GridView grdvw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        if (getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        accomodation = (ImageView)findViewById(R.id.accomodation);
        entertainment = (ImageView)findViewById(R.id.entertainment);
        restaurant = (ImageView)findViewById(R.id.restaurant);
        shoppping = (ImageView)findViewById(R.id.shopping);
        spa = (ImageView)findViewById(R.id.spa);
        events = (ImageView)findViewById(R.id.events);

    //grdvw.setAdapter(new ImageAdaper(this,data));
    }

    public void accomodation(View view){
        Intent intent = new Intent(this,InfoActivity.class);
        startActivity(intent);
    }

    public void entertainment(View view){
        Intent intent = new Intent(this,EntrActivity.class);
        startActivity(intent);
    }

    public void restaurant(View view){
        Intent intent = new Intent(this,RestActivity.class);
        startActivity(intent);
    }

    public void shopping(View view){
        Intent intent = new Intent(this,ShopActivity.class);
        startActivity(intent);
    }

    public void events(View view){
        Intent intent = new Intent(this,EventsActivity.class);
        startActivity(intent);
    }

    public void spa(View view){
        Intent intent = new Intent(this,SpaActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();
//
        switch (item.getItemId()){
            case R.id.info:
                Intent intent = new Intent(this,CapeInfo.class);
                startActivity(intent);
                return  true;

            case R.id.weath:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.accuweather.com/en/za/cape-town/306633/weather-forecast/306633"));
                startActivity(intent1);
                return  true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }


}
