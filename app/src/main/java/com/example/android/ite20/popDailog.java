package com.example.android.ite20;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class popDailog extends DialogFragment implements View.OnClickListener {

    View form;
    Button bu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       form = inflater.inflate(R.layout.popform, container, false);
        bu = (Button) form.findViewById(R.id.bu11);
        bu.setOnClickListener(this);
       ImageView view=(ImageView)form.findViewById(R.id.pu) ;
        Animation animation2 = AnimationUtils.loadAnimation(form.getContext(), R.anim.bounce);
        view.startAnimation(animation2);
        return form;
    }

    @Override
    public void onClick(View v) {
        Button bu=(Button)v;
        this.dismiss();


    }
}