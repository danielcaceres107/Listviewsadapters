package com.example.listviewsnadapters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SeguimientoCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguimiento_category);

        //Definir el adaptador
        ArrayAdapter<Seguimiento> listadapter = new ArrayAdapter<Seguimiento>(this, android.R.layout.simple_list_item_1,  Seguimiento.seguimientos);

        ListView listaSeguimientos= (ListView) findViewById(R.id.lista_seguimientos);
        listaSeguimientos.setAdapter(listadapter);

        //crear el escucha evento
        AdapterView.OnItemClickListener itemClickListener = (adapterView, view, position, id) -> {
            //pasar la bebida al click del usuario
            Intent intent = new Intent(SeguimientoCategoryActivity.this, SeguimientoSelectedActivity.class);
            intent.putExtra(SeguimientoSelectedActivity.EXTRA_SEG, (int) id);
            startActivity(intent);
        };

        //asignar escucha
        listaSeguimientos.setOnItemClickListener(itemClickListener);
    }
}
