package com.example.android.ite20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;


public class AllSchedule extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_schedule);
        final Button show = (Button) findViewById(R.id.show);

        final ImageView the_day = (ImageView) findViewById(R.id.day);
        the_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(AllSchedule.this, the_day);
                popupMenu.getMenuInflater().inflate(R.menu.the_day, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();


                        if (id == R.id.sunday) {
                            TextView textView = (TextView) findViewById(R.id.day_text);
                            textView.setText("الأحد");
                            show.callOnClick();


                        }
                        if (id == R.id.monday) {
                            TextView textView = (TextView) findViewById(R.id.day_text);
                            textView.setText("الاثنين");
                            show.callOnClick();

                        }
                        if (id == R.id.thirthday) {
                            TextView textView = (TextView) findViewById(R.id.day_text);
                            textView.setText("الثلاثاء");
                            show.callOnClick();


                        }
                        if (id == R.id.wenthday) {
                            TextView textView = (TextView) findViewById(R.id.day_text);
                            textView.setText("الاربعاء");
                            show.callOnClick();


                        }
                        if (id == R.id.tusday) {
                            TextView textView = (TextView) findViewById(R.id.day_text);
                            textView.setText("الخميس");
                            show.callOnClick();


                        }
                        return true;
                    }
                });
                popupMenu.show();

            }
        });

        final ImageView Shabaa = (ImageView) findViewById(R.id.caty_img);
        Shabaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(AllSchedule.this, Shabaa);
                popupMenu.getMenuInflater().inflate(R.menu.menu_kind1, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        if (id == R.id.kind1_1) {
                            TextView txtCaty = (TextView) findViewById(R.id.caty_text);
                            txtCaty.setText("الاولى");
                            show.callOnClick();


                        } else if (id == R.id.kind1_2) {
                            TextView txtCaty = (TextView) findViewById(R.id.caty_text);
                            txtCaty.setText("الثانية");
                            show.callOnClick();


                        }


                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        final ImageView feaaa = (ImageView) findViewById(R.id.feaa_img);
        feaaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(AllSchedule.this, feaaa);
                popupMenu.getMenuInflater().inflate(R.menu.menu_kind2, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        if (id == R.id.kind2_1) {
                            TextView txtCaty = (TextView) findViewById(R.id.feaa_Text);
                            txtCaty.setText("الاولى");
                            show.callOnClick();

                        } else if (id == R.id.kind2_2) {
                            TextView txtCaty = (TextView) findViewById(R.id.feaa_Text);
                            txtCaty.setText("الثانية");
                            show.callOnClick();


                        } else if (id == R.id.kind2_3) {
                            TextView txtCaty = (TextView) findViewById(R.id.feaa_Text);
                            txtCaty.setText("الثالثة");
                            show.callOnClick();


                        } else if (id == R.id.kind2_4) {
                            TextView txtCaty = (TextView) findViewById(R.id.feaa_Text);
                            txtCaty.setText("الرابعة");
                            show.callOnClick();


                        }


                        return true;
                    }
                });
                popupMenu.show();

            }
        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.day_text);
                TextView txtCaty = (TextView) findViewById(R.id.caty_text);
                TextView txtfeaa = (TextView) findViewById(R.id.feaa_Text);


                if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("مدرج 1 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة 3 ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("الكترونيات");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 1 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");

                }
               else if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثانية")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("مدرج 1 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة 3 ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("الكترونيات");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 1 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                }
                else if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثالثة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("مدرج 1 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة 3 ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("الكترونيات");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 1 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                }
                else if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الرابعة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("مدرج 1 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة 3 ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("الكترونيات");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 1 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                }
                else if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل عددي عملي  ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("الذكاء الصنعي ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("مدرج 1 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("الكترونيات ");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText(" ق 1");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                }
                else if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثانية")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText(" ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("مدرج 1 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("الكترونيات ");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText(" ق 1");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                }
                else if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثالثة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText(" ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("مدرج 1 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("الكترونيات ");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText(" ق 1");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                }
                else if (textView.getText().equals("الأحد")&& txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الرابعة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText(" ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("مدرج 1 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4 ");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("الكترونيات ");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText(" ق 1");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                }
                else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات عملي");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق 3 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة 3 عملي  ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("الخورزميات ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("تحليل عددي 1 عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("الذكاء الصنعي");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثانية")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات عملي ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق 2 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل عددي عملي");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("الذكاء الصنعي");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثالثة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("حتمالات عملي ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 2");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");

                } else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الرابعة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات عملي ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 2");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("برمجة 3 عملي");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("الخوارزميات");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("دارات الكترونية");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("دارات ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("احتمالات");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText(" ق 4");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثانية")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل عددي عملي");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("الذكاء الصنعي");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("احتمالات عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثالثة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة 3 عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("الخورزميات");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("احتمالات عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");

                } else if (textView.getText().equals("الاثنين") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الرابعة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل عددي عملي ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("احتمالات عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");

                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3 ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق 4 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة الرياضية  ");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 3 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("دارات الكترونية عملي");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText(" الدارات");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثانية")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق4 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("البرمجة الرباضية");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 3");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة 3 عملي ");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("الخورزميات");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثالثة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق 4");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("البرمجة الرباضية");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 3");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("تحليل عددي عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("الذكاء الصنعي");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("برمجة 3 عملي");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("الخورزميات");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الرابعة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق 4");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة الرياضية");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 3");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("درات الكترونية عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("الدارات");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("تحليل عددي عملي");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل 3");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("البرمجة الرياضية");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثانية")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل 3");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("البرمجة الرياضية");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("دارات الكترونية عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("الدارات");


                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثالثة")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل عددي عملي");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("الذكاء الصنعي");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل 3");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("البرمجة الرياضية");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");

                } else if (textView.getText().equals("الثلاثاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الرابعة")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل 3");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 4");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("البرمجة الرياضية");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 4");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("تحليل عددي عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("الذكاء الصنعي");

                } else if (textView.getText().equals("الاربعاء") && txtCaty.getText().
                        equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("مدرج 1 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل عددي 1");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 2 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("لغة اجنبية 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 3");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("لغة اجنبية 3");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("ق 3");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");

                } else if (textView.getText().equals("الاربعاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الاولى")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل عددي 1 ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText(" ق 2 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("مدرح 1 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("لغة اجنبية 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 3");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("لغة اجنبية 3");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("ق 3");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                } else if (textView.getText().equals("الاربعاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثانية")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل عددي 1 ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText(" ق 2 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("مدرح 1 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("لغة اجنبية 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 3");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("لغة اجنبية 3");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("ق 3");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                } else if (textView.getText().equals("الاربعاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثالثة")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل عددي 1 ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText(" ق 2 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("احتمالات");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("مدرح 1 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("لغة اجنبية 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 3");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("لغة اجنبية 3");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("ق 3");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                } else if (textView.getText().equals("الاربعاء") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الرابعة")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("احتمالات ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("مدرج 1 ");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل عددي 1");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 2 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("لغة اجنبية 3");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 3");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("لغة اجنبية 3");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("ق 3");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("دارات الكترونية عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("الدارات");
                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الاولى")) {
                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("برمجة رياضية عملي ");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق 3");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل 3");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 2 ");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("تحليل 3 عملي");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("الذكاء الصنعي");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");

                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثانية")) {


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
                    M4.setText("تحليلي 3 عملي");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الثالثة")) {


                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("دارات الكترونية عملي");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("الدارات");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل 3");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 2");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة الرياضية عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 3");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("تحليل 3 عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("ق 4");
                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الاولى") && txtfeaa.getText().equals("الرابعة")) {


                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("برمجة 3 عملي");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("الخورزميات");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("تحليل 3");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("ق 2");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة الرياضية عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 3");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("تحليل  عملي 3");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");
                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الاولى")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق4");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("تحليل 3 عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("ق 2");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("برمجة رياضية عملي");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثانية")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق4");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("برمجة 3 عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("الخورزميات");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("برمجة رياضية عملي");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("تحليل 3 عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الثالثة")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق4");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("دارات الكترونية عملي");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("الدارات");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("تحليل 3 عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("برمجة رياضية عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                } else if (textView.getText().equals("الخميس") && txtCaty.getText().
                        equals("الثانية") && txtfeaa.getText().equals("الرابعة")) {

                    TextView M1 = (TextView) findViewById(R.id.m1);
                    M1.setText("تحليل 3");
                    TextView C1 = (TextView) findViewById(R.id.l1);
                    C1.setText("ق4");
                    TextView M2 = (TextView) findViewById(R.id.m2);
                    M2.setText("برمجة 3 عملي");
                    TextView C2 = (TextView) findViewById(R.id.l2);
                    C2.setText("الخورزميات");
                    TextView M3 = (TextView) findViewById(R.id.m3);
                    M3.setText("تحليل 3 عملي");
                    TextView C3 = (TextView) findViewById(R.id.l3);
                    C3.setText("");
                    TextView M4 = (TextView) findViewById(R.id.m4);
                    M4.setText("");
                    TextView C4 = (TextView) findViewById(R.id.l4);
                    C4.setText("");
                    TextView M5 = (TextView) findViewById(R.id.m5);
                    M5.setText("برمجة رياضية عملي");
                    TextView C5 = (TextView) findViewById(R.id.l5);
                    C5.setText("");


                }


            }


        });
    }
}


