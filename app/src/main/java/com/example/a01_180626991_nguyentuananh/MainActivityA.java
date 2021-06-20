package com.example.a01_180626991_nguyentuananh;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityA extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Poular> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_a);

        arrayList = new ArrayList<>();
        arrayList.add(new Poular(R.drawable.ghe1,"$550","Matteo Armchair"));
        arrayList.add(new Poular(R.drawable.ghe2,"$350","Modern Armchair"));
        arrayList.add(new Poular(R.drawable.ghe3,"$250","Nice Armchair"));
        arrayList.add(new Poular(R.drawable.ghe4,"$350","Circle Armchair"));
        arrayList.add(new Poular(R.drawable.ghe1,"$550","Matteo Armchair"));
        arrayList.add(new Poular(R.drawable.ghe2,"$350","Modern Armchair"));

        recyclerView = findViewById(R.id.recyclerPou);
        adapter = new RecyclerAdapter(arrayList);
        mLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(mLayoutManager);

        adapter.setOnItemClick(new RecyclerAdapter.onClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivityA.this,MainActivityB.class);
                intent.putExtra("poular",arrayList.get(position));
                startActivity(intent);
            }
        });

    }
}