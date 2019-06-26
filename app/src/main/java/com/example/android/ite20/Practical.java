package com.example.android.ite20;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class Practical
        extends AppCompatActivity {

    private ViewGroup linearLayoutDetails;
    private ImageView imageViewExpand;

    private static final int DURATION = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.practical);


        linearLayoutDetails = (ViewGroup) findViewById(R.id.linearLayoutDetails);
        imageViewExpand = (ImageView) findViewById(R.id.imageViewExpand);

        Toolbar toolbarCard = (Toolbar) findViewById(R.id.toolbarCard);
        toolbarCard.setTitle(R.string.olinguito1);
        toolbarCard.setSubtitle(R.string.subtitle);

    }

    public void toggleDetails(View view) {
        if (linearLayoutDetails.getVisibility() == View.GONE) {
            com.example.android.ite20.ExpandAndCollapseViewUtil.expand(linearLayoutDetails, DURATION);
            imageViewExpand.setImageResource(R.mipmap.more);
            rotate(-180.0f);
        } else {
            com.example.android.ite20.ExpandAndCollapseViewUtil.collapse(linearLayoutDetails, DURATION);
            imageViewExpand.setImageResource(R.mipmap.less);
            rotate(180.0f);
        }
    }

    private void rotate(float angle) {
        Animation animation = new RotateAnimation(0.0f, angle, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setFillAfter(true);
        animation.setDuration(DURATION);
        imageViewExpand.startAnimation(animation);
    }


    public void ProbabilityPr(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/h8jwmn47vd7twzq/AADzH9Tov8ZVwLp3yfp3lKo4a?dl=0"));
        startActivity(intent);
    }

    public void Analysis3Pr(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/7c1mv1vh7sv9d34/AAC10Hb_xEYo5vxLLdon27Mna?dl=0"));
        startActivity(intent);
    }

    public void NumericAnalysis1Pr(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/ti9wzwy7fn75346/AABFW4qeFB2f7cXDjpSIEgcca?dl=0"));
        startActivity(intent);
    }

    public void ElectronicsPr(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/ge6wnp8d3c5z0qj/AAA7y7etAEtOB9fnq4KexrF5a?dl=0"));
        startActivity(intent);
    }

    public void Programming3Pr(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/p9ytkswdo2n49hx/AAATCZPP6yhFfk_lreHrb4DAa?dl=0"));
        startActivity(intent);
    }

    public void MathProgPr(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/ieb2oodn5god6st/AACjzQRvrjgTnkw4HDQvNwbNa?dl=0"));
        startActivity(intent);
    }
}