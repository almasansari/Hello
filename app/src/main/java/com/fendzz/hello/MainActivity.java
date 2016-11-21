package com.fendzz.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements topSectionFragment.TopSectionListener {

    static TextView topText;
    static TextView bottomText;

    @Override
    public void createMeme(String topString, String bottomString) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
