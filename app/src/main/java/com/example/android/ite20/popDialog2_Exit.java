package com.example.android.ite20;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class popDialog2_Exit extends DialogFragment implements View.OnClickListener {

    View form;
    Button stay;
    Button leave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        form = inflater.inflate(R.layout.popdialoge_exit, container, false);
        stay = (Button) form.findViewById(R.id.no);
        leave = (Button) form.findViewById(R.id.yes);
        stay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss( );

            }
        });
        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finishAffinity();
            }
        });

        ImageView view = (ImageView) form.findViewById(R.id.p1u);
        Animation animation2 = AnimationUtils.loadAnimation(form.getContext(), R.anim.bounce);
        view.startAnimation(animation2);
        return form;
    }


    @Override
    public void onClick(View v) {

    }
}