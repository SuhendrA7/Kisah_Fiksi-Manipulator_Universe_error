package com.example.kisahfiksi_manipulatoruniverse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    Adapter adapter;
    int icons[] = {R.drawable.tes};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mencari list judul dan isi

        String [] judul = getResources().getStringArray(R.array.judul_cerita);
        String [] isi = getResources().getStringArray(R.array.isi_cerita);
        
        recyclerView = findViewById(R.id.listCeritaView);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        adapter = new Adapter(this,judul,isi); // adapter takes two strings array
        recyclerView.setAdapter(adapter);
    }
}
