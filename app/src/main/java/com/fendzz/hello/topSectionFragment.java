package com.fendzz.hello;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.media.TransportPerformer;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;

public class topSectionFragment extends Fragment{

    private static Button button;
    private static EditText topText;
    private static EditText bottomText;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String topString, String bottomString);
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }

    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        topText = (EditText) view.findViewById(R.id.topTextInput);
        bottomText = (EditText) view.findViewById(R.id.bottomTextInput);
        button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClick(v);
            }
        });

        return view;
    }
    public void buttonClick(View v)
    {
        activityCommander.createMeme(topText.getText().toString(), bottomText.getText().toString());
    }
}
