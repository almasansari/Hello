package com.fendzz.hello;

import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.TextView;


public class bottomPictureFragment extends Fragment{

    public static TextView topText;
    public static TextView bottomText;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        topText = (TextView) view.findViewById(R.id.top_text);
        bottomText = (TextView) view.findViewById(R.id.bottom_text);
        return view;
    }

    public void setMyText(String top, String bottom)
    {
        topText.setText(top);
        bottomText.setText(bottom);
    }
}
