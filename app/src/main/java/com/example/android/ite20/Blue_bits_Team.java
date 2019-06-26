package com.example.android.ite20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.android.ite20.RecyclerViewHolder.*;


public class Blue_bits_Team extends AppCompatActivity {
    private RecyclerView recyclerView_blue_bits;
    private RecyclerView.LayoutManager layoutManager_blue_bits;
    public RecyclerView.Adapter adapter_blue_bits;
    private ArrayList<Integer> mitemRecycle_blue_bits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_bits__team);
        mitemRecycle_blue_bits = new ArrayList<>();
        mitemRecycle_blue_bits.add(R.drawable.qq);
        mitemRecycle_blue_bits.add(R.drawable.qqq);
        mitemRecycle_blue_bits.add(R.drawable.q);
        recyclerView_blue_bits = (RecyclerView) findViewById(R.id.Blue_bits_recycle);
        recyclerView_blue_bits.setHasFixedSize(true);
        layoutManager_blue_bits = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView_blue_bits.setLayoutManager(layoutManager_blue_bits);
        adapter_blue_bits = new Recycle_Adapter_Blue_Bits(mitemRecycle_blue_bits, getApplicationContext());
        recyclerView_blue_bits.setAdapter(adapter_blue_bits);

    }
}
