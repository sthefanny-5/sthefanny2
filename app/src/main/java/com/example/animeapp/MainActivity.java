package com.example.animeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List items = new ArrayList();
        items.add(new Anime(R.drawable.imagen1, "Hotel Monasterio",1806));
        items.add(new Anime(R.drawable.imagen2, "Pueblito Patojo", 221604));
        items.add(new Anime(R.drawable.imagen3, "Guillermo Leon Valencia", 225483));
        items.add(new Anime(R.drawable.imagen4, "La Catedral", 378952));
        items.add(new Anime(R.drawable.imagen5, "Puente Del Humilladero",75656));

// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador2);
        recycler.setHasFixedSize(true);
// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
// Crear un nuevo adaptador adapter =
        adapter=new AnimeAdapter(items);
        recycler.setAdapter(adapter);
    }
}