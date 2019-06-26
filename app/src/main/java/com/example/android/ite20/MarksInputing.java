package com.example.android.ite20;

import android.app.FragmentManager;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MarksInputing extends AppCompatActivity {
    EditText[] t7lel = new EditText[2];
    EditText[] t7leladdy = new EditText[2];

    EditText[] darat = new EditText[2];

    EditText[] i7tmalat = new EditText[2];

    EditText[] ryadya = new EditText[2];

    EditText[] programmin = new EditText[2];

    EditText english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marks_inputing);
        FragmentManager manager = getFragmentManager();
        popDailog dailog = new popDailog();
        dailog.show(manager, null);
//نظري
        Button button = (Button) findViewById(R.id.busave);

        t7lel[0] = (EditText) findViewById(R.id.e1);
        t7leladdy[0] = (EditText) findViewById(R.id.e2);
        darat[0] = (EditText) findViewById(R.id.e3);
        i7tmalat[0] = (EditText) findViewById(R.id.e4);
        ryadya[0] = (EditText) findViewById(R.id.e5);
        programmin[0] = (EditText) findViewById(R.id.e6);
        english = (EditText) findViewById(R.id.e7);

        t7lel[1] = (EditText) findViewById(R.id.ee1);
        t7leladdy[1] = (EditText) findViewById(R.id.ee2);
        darat[1] = (EditText) findViewById(R.id.ee3);
        i7tmalat[1] = (EditText) findViewById(R.id.ee4);
        ryadya[1] = (EditText) findViewById(R.id.ee5);
        programmin[1] = (EditText) findViewById(R.id.ee6);
        SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);
        t7lel[0].setText(String.valueOf(sharedPreferences.getInt("t7lel", 0)));
        t7lel[1].setText(String.valueOf(sharedPreferences.getInt("t7lelb", 0)));

        t7leladdy[0].setText(String.valueOf(sharedPreferences.getInt("t7leladdy", 0)));
        t7leladdy[1].setText(String.valueOf(sharedPreferences.getInt("t7leladdyb", 0)));

        darat[0].setText(String.valueOf(sharedPreferences.getInt("darat", 0)));
        darat[1].setText(String.valueOf(sharedPreferences.getInt("daratb", 0)));

        i7tmalat[0].setText(String.valueOf(sharedPreferences.getInt("i7tmalat", 0)));
        i7tmalat[1].setText(String.valueOf(sharedPreferences.getInt("i7tmalatb", 0)));

        ryadya[0].setText(String.valueOf(sharedPreferences.getInt("ryadya", 0)));
        ryadya[1].setText(String.valueOf(sharedPreferences.getInt("ryadyab", 0)));

        programmin[0].setText(String.valueOf(sharedPreferences.getInt("programmin", 0)));
        programmin[1].setText(String.valueOf(sharedPreferences.getInt("programminb", 0)));

        english.setText(String.valueOf(sharedPreferences.getInt("english", 0)));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();

try {
    editor.putInt("t7lel", Integer.parseInt(t7lel[0].getText().toString()));
    editor.apply();
    editor.putInt("t7lelb", Integer.parseInt(t7lel[1].getText().toString()));
    editor.apply();
    editor.putInt("t7leladdy", Integer.parseInt(t7leladdy[0].getText().toString()));
    editor.apply();
    editor.putInt("darat", Integer.parseInt(darat[0].getText().toString()));
    editor.apply();
    editor.putInt("i7tmalat", Integer.parseInt(i7tmalat[0].getText().toString()));
    editor.apply();
    editor.putInt("ryadya", Integer.parseInt(ryadya[0].getText().toString()));
    editor.apply();
    editor.putInt("programmin", Integer.parseInt(programmin[0].getText().toString()));
    editor.apply();
    editor.putInt("english", Integer.parseInt(english.getText().toString()));
    editor.apply();


    editor.putInt("t7leladdyb", Integer.parseInt(t7leladdy[1].getText().toString()));
    editor.apply();
    editor.putInt("daratb", Integer.parseInt(darat[1].getText().toString()));
    editor.apply();
    editor.putInt("i7tmalatb", Integer.parseInt(i7tmalat[1].getText().toString()));
    editor.apply();
    editor.putInt("ryadyab", Integer.parseInt(ryadya[1].getText().toString()));
    editor.apply();
    editor.putInt("programminb", Integer.parseInt(programmin[1].getText().toString()));
    editor.apply();
    Toast.makeText(getApplicationContext(),"تم حفظ علاماتك بنجاح",Toast.LENGTH_LONG).show();
      }
      catch(Exception e)
      {
          //TODO:replace with snack bar mr AbdAlqader
          Snackbar.make(v,"تم حفظ علاماتك بنجاح",Snackbar.LENGTH_LONG).show();

      }


            }
        });

    }
}
