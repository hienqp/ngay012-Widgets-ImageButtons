package com.hienqp.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    RelativeLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.bieutuong);
        background = (RelativeLayout) findViewById(R.id.manhinh);

        logo.setImageResource(R.drawable.logo2);
        background.setBackgroundResource(R.drawable.background2);
    }
}