package com.example.nyamundapt.explorecapetown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CapeInfo extends AppCompatActivity {

    TextView heading, heading1,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cape_info);

        heading = (TextView)findViewById(R.id.heading);
        heading1 = (TextView)findViewById(R.id.heading1);
        content = (TextView)findViewById(R.id.content);
    }


}
