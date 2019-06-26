package com.example.android.ite20;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.content.FileProvider;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;


public class Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private ArrayList<other_app_item> mitemRecycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Other App Scrolling Recycle View



        mitemRecycle = new ArrayList<>();
        mitemRecycle.add(new other_app_item("Matlab", R.drawable.mat));
        mitemRecycle.add(new other_app_item("Multisim", R.drawable.malt));
        mitemRecycle.add(new other_app_item("Sc .Calculator", R.drawable.calc));
        mitemRecycle.add(new other_app_item("Java", R.drawable.java));
        mitemRecycle.add(new other_app_item("OOP_C++", R.drawable.cpp));
        mitemRecycle.add(new other_app_item("C Sharp", R.drawable.hss));
        mitemRecycle.add(new other_app_item("Android", R.drawable.anm));
        mitemRecycle.add(new other_app_item("Kotiln", R.drawable.ko));
        recyclerView = (RecyclerView) findViewById(R.id.itherapp_Recycle);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Recycle_Adapter_other_app(mitemRecycle, getApplicationContext());
        recyclerView.setAdapter(adapter);
        //Animation
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        imageView.startAnimation(animation);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        SharedPreferences sharedPreferences = getSharedPreferences("SaveFile", MODE_PRIVATE);

        String name = sharedPreferences.getString("userName", "");


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);
        TextView navUsername = (TextView) headerView.findViewById(R.id.theDonkey);
        navUsername.setText(name);
    }

    @Override
    public void onBackPressed() {
     /*   AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);
        builder.setMessage("هل حقاً تريد المغادرة؟");
        builder.setTitle("رسالة تأكيد");
        builder.setCancelable(true);
        builder.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                finishAffinity();

            }
        });*/
     /*   AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
*/
        FragmentManager manager = getFragmentManager();
        popDialog2_Exit dailog = new popDialog2_Exit();
        dailog.show(manager, null);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


//            ApplicationInfo api = getApplicationContext().getApplicationInfo();
//            String ApkPath = api.sourceDir;
//            Intent intent = new Intent(Intent.ACTION_SEND);
//            intent.setType("application/vnd.android.package-archive");
//            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(ApkPath)));
//            startActivity(Intent.createChooser(intent, "Share App Using"));

            sendApplication2(Main.this);
        }
        if (id == R.id.exita) {
            FragmentManager manager = getFragmentManager();
            popDialog2_Exit dailog = new popDialog2_Exit();
            dailog.show(manager, null);


        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(this, Apps.class);
            startActivity(intent);

        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(this, Links.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(this, Blue_bits_Team.class);
            startActivity(intent);

        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_send) {
            Intent emil=new Intent(Intent.ACTION_SEND);
            emil.putExtra(Intent.EXTRA_EMAIL,new String[]{"abdalqader27.najjar@gmail.com"});
            emil.setType("message/rfc822");
            startActivity(Intent.createChooser(emil,"Choose App to send email"));


        } else if (id == R.id.nav_send2) {
            Intent emil=new Intent(Intent.ACTION_SEND);
            emil.setType("message/rfc822");
            emil.putExtra(Intent.EXTRA_EMAIL,new String[]{"mohammedababelly@gmail.com"});
            startActivity(Intent.createChooser(emil,"Choose App to send email"));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }


    public void prooo(View view) {
        Intent intent = new Intent(this, MarksInputing.class);
        startActivity(intent);
    }


    public void YourMaterial_Click(View view) {
        Intent i = new Intent(getApplicationContext(), YourMatreial.class);
        startActivity(i);
    }


    public void Theoretical(View view) {
        Intent i = new Intent(getApplicationContext(), Theoretical.class);
        startActivity(i);
    }

    public void Practical(View view) {
        Intent i = new Intent(getApplicationContext(), Practical.class);
        startActivity(i);
    }


    public void profile(View view) {
        Intent intent = new Intent(getApplicationContext(), Profile.class);
        startActivity(intent);
    }


    public void Myscedual(View view) {
        Intent intent = new Intent(getApplicationContext(), MySchedule.class);
        startActivity(intent);
    }
    public  void sendApplication2(Activity activity) {
        ApplicationInfo app = activity.getApplicationContext().getApplicationInfo();
        String filePath = app.sourceDir;

        Intent intent = new Intent(Intent.ACTION_SEND);

        // MIME of .apk is "application/vnd.android.package-archive".
        // but Bluetooth does not accept this. Let's use "*/*" instead.
        intent.setType("*/*");

        // Append file and send Intent
        File originalApk = new File(filePath);

        try {
            //Make new directory in new location
            File tempFile = new File(activity.getExternalCacheDir() + "/ExtractedApk");
            //If directory doesn't exists create new
            if (!tempFile.isDirectory()) {
                if (!tempFile.mkdirs()) {
                    return;
                }
            }
            //Get application's name and convert to lowercase
            tempFile = new File(tempFile.getPath() + "/" + activity.getString(app.labelRes).replace(" ", "").toLowerCase() + ".apk");
            //If file doesn't exists create new
            if (!tempFile.exists()) {
                if (!tempFile.createNewFile()) {
                    return;
                }
            }
            //Copy file to new location
            InputStream in = new FileInputStream(originalApk);
            OutputStream out = new FileOutputStream(tempFile);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
            System.out.println("File copied.");
            //Open share dialog
            Context context=getApplicationContext();

            Uri uri = FileProvider.getUriForFile(context, activity.getPackageName(), tempFile);
            intent.putExtra(Intent.EXTRA_STREAM, uri);
            activity.grantUriPermission(activity.getPackageManager().toString(), uri, Intent.FLAG_GRANT_WRITE_URI_PERMISSION | Intent.FLAG_GRANT_READ_URI_PERMISSION);
            activity.startActivity(intent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

