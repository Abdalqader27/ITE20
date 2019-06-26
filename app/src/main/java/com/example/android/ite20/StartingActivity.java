package com.example.android.ite20;

import android.content.Intent;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class StartingActivity extends AppCompatActivity {
   

    EditText nameFeild;
    ImageView img_Kind1;
    ImageView img_Kind2;
    String P1;
    String P2;
    String PK1;
    String PK2;
    String PK3;
    String PK4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        SharedPreferences sp=getSharedPreferences("abc",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();

        int x = sp.getInt("x", 0);
        if (x == 0 ) {
            x++;
            ed.putInt("x", x);
            ed.commit();
        } else {
            Intent i = new Intent(StartingActivity.this, Main.class);
            startActivity(i);
            finish();

        }


        img_Kind1 = (ImageView) findViewById(R.id.kind1_img);
        img_Kind2 = (ImageView) findViewById(R.id.kind2_img);
        nameFeild = (EditText) findViewById(R.id.theName);

        //االشعبة
        img_Kind1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(StartingActivity.this, img_Kind1);
                popupMenu.getMenuInflater().inflate(R.menu.menu_kind1, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();


                        if (id == R.id.kind1_1) {
                            P1 = "الاولى";
                            TextView view=(TextView)findViewById(R.id.choiceShabaa);
                            view.setText(P1);
                            SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putString("key1", P1);

                            editor.apply();


                        }
                        if (id == R.id.kind1_2) {
                            P2 = "الثانية";
                            TextView view=(TextView)findViewById(R.id.choiceShabaa);
                            view.setText(P2);
                            SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putString("key2", P2);

                            editor.apply();
                        }
                        return true;
                    }
                });
                popupMenu.show();

            }
        });
        //الفئة
        img_Kind2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(StartingActivity.this, img_Kind2);
                popupMenu.getMenuInflater().inflate(R.menu.menu_kind2, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();


                        if (id == R.id.kind2_1) {
                            PK1 = "الاولى";
                            TextView view=(TextView)findViewById(R.id.choicefeaa);
                            view.setText(PK1);
                            SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putString("kkey1", PK1);

                            editor.apply();
                        }
                        if (id == R.id.kind2_2) {
                            PK2 = "الثانية";
                            TextView view=(TextView)findViewById(R.id.choicefeaa);
                            view.setText(PK2);
                            SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putString("kkey2", PK2);

                            editor.apply();
                        }
                        if (id == R.id.kind2_3) {
                            PK3 = "الثالثة";
                            TextView view=(TextView)findViewById(R.id.choicefeaa);
                            view.setText(PK3);
                            SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putString("kkey3", PK3);

                            editor.apply();
                        }
                        if (id == R.id.kind2_4) {
                            PK4 = "الرابعة";
                            TextView view=(TextView)findViewById(R.id.choicefeaa);
                            view.setText(PK4);
                            SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putString("kkey4", PK4);

                            editor.apply();
                        }
                        return true;
                    }
                });
                popupMenu.show();

            }
        });

    }


    public boolean buEnterClicked(View view) {


        if (nameFeild!=null && (P1 != null || P2 != null) && (PK1 != null || PK2 != null || PK3 != null || PK4 != null)) {
            SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("userName", nameFeild.getText().toString());
            editor.apply();
            Intent i = new Intent(StartingActivity.this, Main.class);
            startActivity(i);
            finish();
        } else {
            ShowToast();

        }
        return true;





    }
    public void onBackPressed(){


    }

    private void ShowToast() {
        LayoutInflater inflater=getLayoutInflater();
        View  layout=inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.root_Custom1));
        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

    }
}
