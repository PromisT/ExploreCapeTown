package com.example.nyamundapt.explorecapetown;

import android.content.Context;

/**
 * Created by CodeTribe on 8/11/2017.
 */

public class facts {
Context context;
private int mImage;
    private String mFact;

    public facts(int mImage, String mFact) {
        this.mImage = mImage;
        this.mFact = mFact;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmFact() {
        return mFact;
    }

    // Picasso.with(context).facts(Uri.parse(currentfacts.getmImage())).into(imageView);
}
