package com.example.listviewsnadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DiagnosticoCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico_categorys);

        //Definir el adaptador
        ArrayAdapter<Diagnostico> listadapter = new ArrayAdapter<Diagnostico>(this, android.R.layout.simple_list_item_1,  Diagnostico.diagnosticos);

        ListView listaPerfiles= (ListView) findViewById(R.id.lista_diagnosticos);
        listaPerfiles.setAdapter(listadapter);

        //crear el escucha evento
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //pasar la bebida al click del usuario
                Intent intent = new Intent(DiagnosticoCategoryActivity.this, DiagnosticoSelectedActivity.class);
                intent.putExtra(DiagnosticoSelectedActivity.EXTRA_DIAG, (int) id);
                startActivity(intent);
            }
        };

        //asignar escucha
        listaPerfiles.setOnItemClickListener(itemClickListener);
    }
}