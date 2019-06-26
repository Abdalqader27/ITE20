package com.example.android.ite20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Links extends AppCompatActivity {
    private RecyclerView recyclerViewl_links;
    private RecyclerView.LayoutManager layoutManagerl_links;
    public RecyclerView.Adapter adapterl_links;
    private ArrayList<other_app_item> mitemRecyclel_links;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);
        mitemRecyclel_links = new ArrayList<>();

        mitemRecyclel_links.add(new other_app_item("الهندسة المعلوماتية الدفعة 20", R.drawable.face));
        mitemRecyclel_links.add(new other_app_item("لاننا معلوماتيون هذه اهتماماتنا", R.drawable.face));
        mitemRecyclel_links.add(new other_app_item("الهيئة الإدارية للهندسة المعلوماتية", R.drawable.face));
        mitemRecyclel_links.add(new other_app_item(" Blue Bits", R.drawable.face));
        mitemRecyclel_links.add(new other_app_item(" Blue Bits Channel", R.drawable.teleq));
        mitemRecyclel_links.add(new other_app_item(" Blue Bits Bot", R.drawable.teleq));
        mitemRecyclel_links.add(new other_app_item(" Blue Bits ", R.drawable.you));


        recyclerViewl_links = (RecyclerView) findViewById(R.id.recycle_Link);
        recyclerViewl_links.setHasFixedSize(true);
        layoutManagerl_links = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerViewl_links.setLayoutManager(layoutManagerl_links);
        adapterl_links = new Recycle_Adapter_links(mitemRecyclel_links, getApplicationContext());
        recyclerViewl_links.setAdapter(adapterl_links);
    }
}
