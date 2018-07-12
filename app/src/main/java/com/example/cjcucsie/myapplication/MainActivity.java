package com.example.cjcucsie.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Listitem> liatItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        liatItem = new ArrayList<>();

        for(int i = 0;i<10;i++){
            Listitem listitem = new Listitem("heading " + (i+1),
                    "Lorem ipsum dunny text"
            );
            liatItem.add(listitem);
        }

        adapter = new MyAdapter(liatItem, this);

        recyclerView.setAdapter(adapter);
    }
}
