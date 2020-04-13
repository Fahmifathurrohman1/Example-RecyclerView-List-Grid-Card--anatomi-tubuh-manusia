package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnatomi;
    private ArrayList<Anatomi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnatomi = findViewById(R.id.rv_anatomi);
        rvAnatomi.setHasFixedSize(true);

        list.addAll(Anatomidata.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvAnatomi.setLayoutManager(new LinearLayoutManager(this));
        com.example.pertemuan7.ListAnatomiAdapter listHeroAdapter = new com.example.pertemuan7.ListAnatomiAdapter();
        listHeroAdapter.Adapter();
        rvAnatomi.setAdapter(listHeroAdapter);
    }
}