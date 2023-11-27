package com.tientran.ecommercevn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewFlipper viewFlipper;
    private RecyclerView recyclerViewMain;
    private NavigationView navigationView;
    private ListView listViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void viewMapping(){
        toolbar = findViewById(R.id.toolbarMain);
        viewFlipper = findViewById(R.id.viewFlipper);
        recyclerViewMain = findViewById(R.id.recycleViewProduct);
        navigationView = findViewById(R.id.navigationView);
        listViewMain = findViewById(R.id.listView);
    }
}