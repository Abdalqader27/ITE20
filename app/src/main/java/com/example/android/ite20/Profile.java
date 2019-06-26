package com.example.android.ite20;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        TextView userName = (TextView) findViewById(R.id.name);

        TextView textView = (TextView) findViewById(R.id.kind1);
        TextView kind = (TextView) findViewById(R.id.kind2);
        TextView average = (TextView) findViewById(R.id.finalAverage);


        EditText t7lel = (EditText) findViewById(R.id.t7lel);
        EditText t7leladdy = (EditText) findViewById(R.id.t7leladdy);
        EditText darat = (EditText) findViewById(R.id.darat);
        EditText i7tmalat = (EditText) findViewById(R.id.i7tmalat);
        EditText ryadya = (EditText) findViewById(R.id.ryadya);
        EditText programmin = (EditText) findViewById(R.id.programmin);
        EditText english = (EditText) findViewById(R.id.english);


        SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

        String name = sharedPreferences.getString("userName", "");


        String s = sharedPreferences.getString("key1", "");
        String s2 = sharedPreferences.getString("key2", "");

        String k1 = sharedPreferences.getString("kkey1", "");
        String k2 = sharedPreferences.getString("kkey2", "");
        String k3 = sharedPreferences.getString("kkey3", "");
        String k4 = sharedPreferences.getString("kkey4", "");
        //---------------------------------------------


        //--------------------------------------------

        int t7lel0 = sharedPreferences.getInt("t7lel", 0);
        int t7leladdy0 = sharedPreferences.getInt("t7leladdy", 0);

        int darat0 = (sharedPreferences.getInt("darat", 0));
        int i7tmalat0 = (sharedPreferences.getInt("i7tmalat", 0));
        int ryadya0 = (sharedPreferences.getInt("ryadya", 0));
        int programmin0 = (sharedPreferences.getInt("programmin", 0));
        int english100 = (sharedPreferences.getInt("english", 0));


        int t7lel1 = sharedPreferences.getInt("t7lelb", 0);
        int t7leladdy1 = sharedPreferences.getInt("t7leladdyb", 0);

        int darat1 = (sharedPreferences.getInt("daratb", 0));
        int i7tmalat1 = (sharedPreferences.getInt("i7tmalatb", 0));
        int ryadya1 = (sharedPreferences.getInt("ryadyab", 0));
        int programmin1 = (sharedPreferences.getInt("programminb", 0));

        t7lel.setText((String.valueOf(t7lel0 + t7lel1)));
        t7leladdy.setText(String.valueOf(t7leladdy0 + t7leladdy1));
        darat.setText((String.valueOf(darat0 + darat1)));
        i7tmalat.setText((String.valueOf(i7tmalat0 + i7tmalat1)));
        ryadya.setText((String.valueOf(ryadya0 + ryadya1)));
        programmin.setText((String.valueOf(programmin0 + programmin1)));
        english.setText((String.valueOf(english100)));

        userName.setText(name);


        if (s.equals("الاولى")) {
            textView.setText(s);


        } else if (s2.equals("الثانية")) {
            textView.setText(s2);
        }


        if (k1.equals("الاولى"))

        {
            kind.setText(k1);

        } else if (k2.equals("الثانية")) {
            kind.setText(k2);


        } else if (k3.equals("الثالثة")) {
            kind.setText(k3);


        } else {
            kind.setText(k4);


        }

            float a = t7lel0 + t7lel1 + t7leladdy0 + t7leladdy1 + i7tmalat0 + i7tmalat1 + darat0 + darat1 + ryadya0 + ryadya1 + programmin0 + programmin1 + english100;
            a = a / 7;
            average.setText(String.valueOf(a));



    }
}
