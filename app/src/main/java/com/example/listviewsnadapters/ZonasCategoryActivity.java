package com.example.listviewsnadapters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ZonasCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonas_category);

        //Definir el adaptador
        ArrayAdapter<Zonas> listAdapter = new ArrayAdapter<Zonas>(this, android.R.layout.simple_list_item_1,  Zonas.zonas);

        ListView listaZonas= (ListView) findViewById(R.id.lista_zonas);
        listaZonas.setAdapter(listAdapter);

        //crear el escucha evento
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //pasar la bebida al click del usuario
                Intent intent = new Intent(ZonasCategoryActivity.this, ZonasSelectedActivity.class);
                intent.putExtra(ZonasSelectedActivity.EXTRA_ZON, (int) id);
                startActivity(intent);
            }
        };

        //asignar escucha
        listaZonas.setOnItemClickListener(itemClickListener);
    }
}
