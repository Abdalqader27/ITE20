package com.example.android.ite20;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MySchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_scheduale);
        //java.util.Date du = new java.util.Date();
       // java.text.SimpleDateFormat fm = new java.text.SimpleDateFormat();
        try{
        TextView  textView=(TextView)findViewById(R.id.thatDay);
      textView.setText(getCurrentDay());

        SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);



        String s = sharedPreferences.getString("key1", "");
        String s2 = sharedPreferences.getString("key2", "");

        String k1 = sharedPreferences.getString("kkey1", "");
        String k2 = sharedPreferences.getString("kkey2", "");
        String k3 = sharedPreferences.getString("kkey3", "");
        String k4 = sharedPreferences.getString("kkey4", "");
        //---------------------------------------------

        if(getCurrentDay().equals("الاحد")&&s.equals("الاولى")&&k1.equals("الاولى")){
            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة 3 ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("الكترونيات");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 1 ");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الاحد")&&s.equals("الاولى")&&k2.equals("الثانية")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة 3 ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("الكترونيات");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 1 ");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الاحد")&&s.equals("الاولى")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة 3 ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("الكترونيات");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 1 ");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الاحد")&&s.equals("الاولى")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة 3 ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("الكترونيات");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 1 ");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الاحد")&&s2.equals("الثانية")&&k1.equals("الاولى")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل عددي عملي ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("الذكاء الصنعي");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("الاحتمالات");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("مدرج 1");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("برمجة 3");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 4 ");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("دارات الكترونية");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("ق 1");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الاحد")&&s2.equals("الثانية")&&k2.equals("الثانية")){

               TextView M1 = (TextView) findViewById(R.id.mm1);
               M1.setText("");
               TextView C1 = (TextView) findViewById(R.id.ll1);
               C1.setText("");
               TextView M2 = (TextView) findViewById(R.id.mm2);
               M2.setText("الاحتمالات");
               TextView C2 = (TextView) findViewById(R.id.ll2);
               C2.setText("مدرج 1");
               TextView M3 = (TextView) findViewById(R.id.mm3);
               M3.setText("برمجة 3");
               TextView C3 = (TextView) findViewById(R.id.ll3);
               C3.setText("ق 4 ");
               TextView M4 = (TextView) findViewById(R.id.mm4);
               M4.setText("دارات الكترونية");
               TextView C4 = (TextView) findViewById(R.id.ll4);
               C4.setText("");
               TextView M5 = (TextView) findViewById(R.id.mm5);
               M5.setText("");
               TextView C5 = (TextView) findViewById(R.id.ll5);
               C5.setText("");


        }
           if(getCurrentDay().equals("الاحد")&&s2.equals("الثانية")&&k3.equals("الثالثة")){


               TextView M1 = (TextView) findViewById(R.id.mm1);
               M1.setText("");
               TextView C1 = (TextView) findViewById(R.id.ll1);
               C1.setText("");
               TextView M2 = (TextView) findViewById(R.id.mm2);
               M2.setText("الاحتمالات");
               TextView C2 = (TextView) findViewById(R.id.ll2);
               C2.setText("مدرج 1");
               TextView M3 = (TextView) findViewById(R.id.mm3);
               M3.setText("برمجة 3");
               TextView C3 = (TextView) findViewById(R.id.ll3);
               C3.setText("ق 4 ");
               TextView M4 = (TextView) findViewById(R.id.mm4);
               M4.setText("دارات الكترونية");
               TextView C4 = (TextView) findViewById(R.id.ll4);
               C4.setText("");
               TextView M5 = (TextView) findViewById(R.id.mm5);
               M5.setText("");
               TextView C5 = (TextView) findViewById(R.id.ll5);
               C5.setText("");


        }
           if(getCurrentDay().equals("الاحد")&&s2.equals("الثانية")&&k4.equals("الرابعة")){


               TextView M1 = (TextView) findViewById(R.id.mm1);
               M1.setText("");
               TextView C1 = (TextView) findViewById(R.id.ll1);
               C1.setText("");
               TextView M2 = (TextView) findViewById(R.id.mm2);
               M2.setText("الاحتمالات");
               TextView C2 = (TextView) findViewById(R.id.ll2);
               C2.setText("مدرج 1");
               TextView M3 = (TextView) findViewById(R.id.mm3);
               M3.setText("برمجة 3");
               TextView C3 = (TextView) findViewById(R.id.ll3);
               C3.setText("ق 4 ");
               TextView M4 = (TextView) findViewById(R.id.mm4);
               M4.setText("دارات الكترونية");
               TextView C4 = (TextView) findViewById(R.id.ll4);
               C4.setText("");
               TextView M5 = (TextView) findViewById(R.id.mm5);
               M5.setText("");
               TextView C5 = (TextView) findViewById(R.id.ll5);
               C5.setText("");

        }// monday
          if(getCurrentDay().equals("الاثنين")&&s.equals("الاولى")&&k1.equals("الاولى")){
            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات عملي");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق 3 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة 3 عملي  ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("الخورزميات ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("تحليل عددي 1 عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("الذكاء الصنعي");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الاثنين")&&s.equals("الاولى")&&k2.equals("الثانية")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات عملي ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق 2 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل عددي عملي");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("الذكاء الصنعي");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");



        }
           if(getCurrentDay().equals("الاثنين")&&s.equals("الاولى")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("حتمالات عملي ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الاثنين")&&s.equals("الاولى")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("احتمالات عملي ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");



        }
           if(getCurrentDay().equals("الاثنين")&&s2.equals("الثانية")&&k1.equals("الاولى")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("برمجة 3 عملي");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("الخوارزميات");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("دارات الكترونية");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("دارات ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("احتمالات");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText(" ق 4");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
           if(getCurrentDay().equals("الاثنين")&&s2.equals("الثانية")&&k2.equals("الثانية")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل عددي عملي");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("الذكاء الصنعي");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("احتمالات عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");



        }
           if(getCurrentDay().equals("الاثنين")&&s2.equals("الثانية")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("برمجة 3 عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("الخورزميات");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("احتمالات عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
           if(getCurrentDay().equals("الاثنين")&&s2.equals("الثانية")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("احتمالات عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
        //thirday
         if(getCurrentDay().equals("الثلاثاء")&&s.equals("الاولى")&&k1.equals("الاولى")){
            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3 ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق 4 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة الرياضية  ");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 3 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("دارات الكترونية عملي");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText(" الدارات");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الثلاثاء")&&s.equals("الاولى")&&k2.equals("الثانية")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق4 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("البرمجة الرباضية");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 3");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("برمجة 3 عملي ");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("الخورزميات");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");



        }
           if(getCurrentDay().equals("الثلاثاء")&&s.equals("الاولى")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق 4");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("البرمجة الرباضية");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 3");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("تحليل عددي عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("الذكاء الصنعي");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("برمجة 3 عملي");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("الخورزميات");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الثلاثاء")&&s.equals("الاولى")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق 4");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة الرياضية");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 3");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("درات الكترونية عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("الدارات");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("تحليل عددي عملي");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("الذكاء الصنعي");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
           if(getCurrentDay().equals("الثلاثاء")&&s2.equals("الثانية")&&k1.equals("الاولى")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("");
            TextView C1 = (TextView) findViewById(R.id.ll2);
            C1.setText("");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("البرمجة الرياضية");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 4");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الثلاثاء")&&s2.equals("الثانية")&&k2.equals("الثانية")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("البرمجة الرياضية");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 4");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("دارات الكترونية عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("الدارات");


        }
           if(getCurrentDay().equals("الثلاثاء")&&s2.equals("الثانية")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل عددي عملي");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("الذكاء الصنعي");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("البرمجة الرياضية");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 4");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الثلاثاء")&&s2.equals("الثانية")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 4");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("البرمجة الرياضية");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 4");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("تحليل عددي عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("الذكاء الصنعي");
        }

        //wenrhday
         if(getCurrentDay().equals("الاربعاء")&&s.equals("الاولى")&&k1.equals("الاولى")){
            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل عددي 1");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("لغة اجنبية 3");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 3");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("لغة اجنبية 3");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("ق 3");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
        if(getCurrentDay().equals("الاربعاء")&&s.equals("الاولى")&&k2.equals("الثانية")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل عددي 1");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("لغة اجنبية 3");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 3");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("لغة اجنبية 3");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("ق 3");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
        if(getCurrentDay().equals("الاربعاء")&&s.equals("الاولى")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل عددي 1");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("لغة اجنبية 3");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 3");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("لغة اجنبية 3");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("ق 3");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
           if(getCurrentDay().equals("الاربعاء")&&s.equals("الاولى")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("احتمالات ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("مدرج 1 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل عددي 1");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("لغة اجنبية 3");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 3");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("لغة اجنبية 3");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("ق 3");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
         if(getCurrentDay().equals("الاربعاء")&&s2.equals("الثانية")&&k1.equals("الاولى")){


            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل عددي 1 ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText(" ق 2 ");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("احتمالات");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText(" مدرج 1");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("لغة اجنبية 3");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 3");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("لغة اجنبية 3");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("ق 3");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الاربعاء")&&s2.equals("الثانية")&&k2.equals("الثانية")){

               TextView M1 = (TextView) findViewById(R.id.mm1);
               M1.setText("تحليل عددي 1 ");
               TextView C1 = (TextView) findViewById(R.id.ll1);
               C1.setText(" ق 2 ");
               TextView M2 = (TextView) findViewById(R.id.mm2);
               M2.setText("احتمالات");
               TextView C2 = (TextView) findViewById(R.id.ll2);
               C2.setText(" مدرج 1");
               TextView M3 = (TextView) findViewById(R.id.mm3);
               M3.setText("لغة اجنبية 3");
               TextView C3 = (TextView) findViewById(R.id.ll3);
               C3.setText("ق 3");
               TextView M4 = (TextView) findViewById(R.id.mm4);
               M4.setText("لغة اجنبية 3");
               TextView C4 = (TextView) findViewById(R.id.ll4);
               C4.setText("ق 3");
               TextView M5 = (TextView) findViewById(R.id.mm5);
               M5.setText("");
               TextView C5 = (TextView) findViewById(R.id.ll5);
               C5.setText("");
        }
           if(getCurrentDay().equals("الاربعاء")&&s2.equals("الثانية")&&k3.equals("الثالثة")){

               TextView M1 = (TextView) findViewById(R.id.mm1);
               M1.setText("تحليل عددي 1 ");
               TextView C1 = (TextView) findViewById(R.id.ll1);
               C1.setText(" ق 2 ");
               TextView M2 = (TextView) findViewById(R.id.mm2);
               M2.setText("احتمالات");
               TextView C2 = (TextView) findViewById(R.id.ll2);
               C2.setText(" مدرج 1");
               TextView M3 = (TextView) findViewById(R.id.mm3);
               M3.setText("لغة اجنبية 3");
               TextView C3 = (TextView) findViewById(R.id.ll3);
               C3.setText("ق 3");
               TextView M4 = (TextView) findViewById(R.id.mm4);
               M4.setText("لغة اجنبية 3");
               TextView C4 = (TextView) findViewById(R.id.ll4);
               C4.setText("ق 3");
               TextView M5 = (TextView) findViewById(R.id.mm5);
               M5.setText("");
               TextView C5 = (TextView) findViewById(R.id.ll5);
               C5.setText("");
        }
           if(getCurrentDay().equals("الاربعاء")&&s2.equals("الثانية")&&k4.equals("الرابعة")){

               TextView M1 = (TextView) findViewById(R.id.mm1);
               M1.setText("تحليل عددي 1 ");
               TextView C1 = (TextView) findViewById(R.id.ll1);
               C1.setText(" ق 2 ");
               TextView M2 = (TextView) findViewById(R.id.mm2);
               M2.setText("احتمالات");
               TextView C2 = (TextView) findViewById(R.id.ll2);
               C2.setText(" مدرج 1");
               TextView M3 = (TextView) findViewById(R.id.mm3);
               M3.setText("لغة اجنبية 3");
               TextView C3 = (TextView) findViewById(R.id.ll3);
               C3.setText("ق 3");
               TextView M4 = (TextView) findViewById(R.id.mm4);
               M4.setText("لغة اجنبية 3");
               TextView C4 = (TextView) findViewById(R.id.ll4);
               C4.setText("ق 3");
               TextView M5 = (TextView) findViewById(R.id.mm5);
               M5.setText("دارات الكترونية عملي");
               TextView C5 = (TextView) findViewById(R.id.ll5);
               C5.setText("دارات");
        }
        //tuesday
         if(getCurrentDay().equals("الخميس")&&s.equals("الاولى")&&k1.equals("الاولى")){
            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("برمجة رياضية عملي ");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق 3");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2 ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("تحليل 3 عملي");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("ق 4");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");

        }
           if(getCurrentDay().equals("الخميس")&&s.equals("الاولى")&&k2.equals("الثانية")){


            TextView M1 = (TextView) findViewById(R.id.m1);
            M1.setText("برمجة رياضية");
            TextView C1 = (TextView) findViewById(R.id.l1);
            C1.setText("ق 3 ");
            TextView M2 = (TextView) findViewById(R.id.m2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.l2);
            C2.setText("ق 2");
            TextView M3 = (TextView) findViewById(R.id.m3);
            M3.setText("دارات الكترونية عملي");
            TextView C3 = (TextView) findViewById(R.id.l3);
            C3.setText("الدارات");
            TextView M4 = (TextView) findViewById(R.id.m4);
            M4.setText("تحليل 3 عملي");
            TextView C4 = (TextView) findViewById(R.id.l4);
            C4.setText("ق 4");
            TextView M5 = (TextView) findViewById(R.id.m5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.l5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الخميس")&&s.equals("الاولى")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("دارات الكترونية عملي");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("الدارات");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("برمجة الرياضية عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 3");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("تحليل 3 عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("ق 4");
        }
           if(getCurrentDay().equals("الخميس")&&s.equals("الاولى")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("برمجة 3 عملي");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("الخورزميات");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("تحليل 3");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("ق 2");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("برمجة الرياضية عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 3");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("تحليل  عملي 3");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الخميس")&&s2.equals("الثانية")&&k1.equals("الاولى")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3");
            TextView C1 = (TextView) findViewById(R.id.ll2);
            C1.setText("ق4");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText(" ");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText(" تحليل 3عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("ق 2 ");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("برمجة رياضية عملي");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الخميس")&&s2.equals("الثانية")&&k2.equals("الثانية")){


            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق4");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("برمجة 3 عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("الخورزميات");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("برمجة رياضية عملي");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("تحليل 3 عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");


        }
           if(getCurrentDay().equals("الخميس")&&s2.equals("الثانية")&&k3.equals("الثالثة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق4");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("دارات الكترونية عملي");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("الدارات");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("تحليل 3 عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("برمجة رياضية عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
           if(getCurrentDay().equals("الخميس")&&s2.equals("الثانية")&&k4.equals("الرابعة")){

            TextView M1 = (TextView) findViewById(R.id.mm1);
            M1.setText("تحليل 3");
            TextView C1 = (TextView) findViewById(R.id.ll1);
            C1.setText("ق4");
            TextView M2 = (TextView) findViewById(R.id.mm2);
            M2.setText("برمجة 3 عملي");
            TextView C2 = (TextView) findViewById(R.id.ll2);
            C2.setText("الخورزميات");
            TextView M3 = (TextView) findViewById(R.id.mm3);
            M3.setText("تحليل 3 عملي");
            TextView C3 = (TextView) findViewById(R.id.ll3);
            C3.setText("");
            TextView M4 = (TextView) findViewById(R.id.mm4);
            M4.setText("");
            TextView C4 = (TextView) findViewById(R.id.ll4);
            C4.setText("");
            TextView M5 = (TextView) findViewById(R.id.mm5);
            M5.setText("برمجة رياضية عملي");
            TextView C5 = (TextView) findViewById(R.id.ll5);
            C5.setText("");
        }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();

        }
    }
    public String getCurrentDay() {

        ArrayList<String>Days =new ArrayList<>();
        Days.add("السبت");
        Days.add("الاحد");
        Days.add("الاثنين");
        Days.add("الثلاثاء");
        Days.add("الاربعاء");
        Days.add("الخميس");
        Days.add("الجمعة ");
        Days.add("السبت ");


        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        return Days.get(day);
    }


    public void pro(View view) {

        Intent i = new Intent(getApplicationContext(), AllSchedule.class);
        startActivity(i);

    }
}
