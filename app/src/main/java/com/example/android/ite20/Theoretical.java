package com.example.android.ite20;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class Theoretical
        extends AppCompatActivity {

    private ViewGroup linearLayoutDetails;
    private ImageView imageViewExpand;

    private static final int DURATION = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.theoretical);

        linearLayoutDetails = (ViewGroup) findViewById(R.id.linearLayoutDetails);
        imageViewExpand = (ImageView) findViewById(R.id.imageViewExpand);

        Toolbar toolbarCard = (Toolbar) findViewById(R.id.toolbarCard);
        toolbarCard.setTitle(R.string.olinguito);
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


    public void ProbabilityTh(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/9mn496hxer6dayr/AAAw_m6-b_aKF7S_wrBmgGlha?dl=0"));
        startActivity(intent);
    }

    public void Analysis3Th(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/znkilv5hq4zc5c0/AACuqov7m3PhtpO8wmSmdCyEa?dl=0"));
        startActivity(intent);
    }

    public void ElectronicsTh(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/0ktqgnabzy0wdnz/AACe0HiHTV1F0OIJmeIt_F6Na?dl=0"));
        startActivity(intent);
    }

    public void NumericAnalysis1Th(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/l6hb8up14es7800/AAAuYSfZA2deUVOzt9YggLBEa?dl=0"));
        startActivity(intent);
    }

    public void Programming3Th(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/chhjtq8jm7jcdff/AACXhmzFe7v0hMrZ_CRnRn_Ha?dl=0"));
        startActivity(intent);
    }

    public void MathProgTh(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/kouwydb6fud885e/AACsCSyWYqWvZqDdUt-ssY8da?dl=0"));
        startActivity(intent);
    }

    public void English3Th(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dropbox.com/sh/b8nrkidb9jwgzd7/AABVNvofJWDhKn5yhZh7r4ava?dl=0"));
        startActivity(intent);
    }


}
