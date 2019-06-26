package com.example.android.ite20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Apps extends AppCompatActivity {
    private RecyclerView recyclerView_Apps_windows;
    private RecyclerView.LayoutManager layoutManager_Apps_windows;
    private RecyclerView.Adapter adapter_apps_windows;
    private ArrayList<other_app_item> mitemRecycle_apps_windows;
    //android
    private RecyclerView recyclerView2_apps_android;
    private RecyclerView.LayoutManager layoutManager2_apps_android;
    private RecyclerView.Adapter adapter2_apps_android;
    private ArrayList<other_app_item> mitemRecycle2_apps_android;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apps);
        //Windows
        mitemRecycle_apps_windows = new ArrayList<>();
        mitemRecycle_apps_windows.add(new other_app_item("Matlab 2018", R.drawable.mat));
        mitemRecycle_apps_windows.add(new other_app_item("Multisim", R.drawable.malt));
        mitemRecycle_apps_windows.add(new other_app_item("JDK Java", R.drawable.java));
        mitemRecycle_apps_windows.add(new other_app_item("NetBeans", R.drawable.netb));
        mitemRecycle_apps_windows.add(new other_app_item("CodeBlocks", R.drawable.code));
        mitemRecycle_apps_windows.add(new other_app_item("Android Studio", R.drawable.androidstduoicon));
        mitemRecycle_apps_windows.add(new other_app_item("Visual Studio", R.drawable.visual));

        recyclerView_Apps_windows = (RecyclerView) findViewById(R.id.recycle_windows);
        recyclerView_Apps_windows.setHasFixedSize(true);
        layoutManager_Apps_windows = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView_Apps_windows.setLayoutManager(layoutManager_Apps_windows);
        adapter_apps_windows = new Recycle_Adapter_windows(mitemRecycle_apps_windows, getApplicationContext());
        recyclerView_Apps_windows.setAdapter(adapter_apps_windows);
        //android
        mitemRecycle2_apps_android = new ArrayList<>();
        mitemRecycle2_apps_android.add(new other_app_item("Duolingo Learn Languages", R.drawable.dou));
        mitemRecycle2_apps_android.add(new other_app_item("SnapTube ", R.drawable.snapi));
        mitemRecycle2_apps_android.add(new other_app_item("Telegram", R.drawable.tele));
        mitemRecycle2_apps_android.add(new other_app_item("Mi Drop", R.drawable.midrop));
        mitemRecycle2_apps_android.add(new other_app_item("SoloLearn", R.drawable.solo));
        mitemRecycle2_apps_android.add(new other_app_item("CppDroid - C/C++ IDE APK", R.drawable.cppdroid));
        mitemRecycle2_apps_android.add(new other_app_item("Dcoder, Mobile Compiler IDE", R.drawable.decoder));

        recyclerView2_apps_android = (RecyclerView) findViewById(R.id.recycle_android);
        recyclerView2_apps_android.setHasFixedSize(true);
        layoutManager2_apps_android = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView2_apps_android.setLayoutManager(layoutManager2_apps_android);
        adapter2_apps_android = new Recycle_Adapter_Android(mitemRecycle2_apps_android, getApplicationContext());
        recyclerView2_apps_android.setAdapter(adapter2_apps_android);
    }
}
