package com.example.listviewsnadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevel extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        //crear un item listener
        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener(){
          @Override
          public void onItemClick (AdapterView<?> listView, View itemView, int position, long id) {
              if (position == 0){
                  //lanzar la actividad
                  Intent intent = new Intent(TopLevel.this, DiagnosticoCategoryActivity.class);
                  startActivity(intent);
              }
              if (position == 1){
                  //lanzar la actividad
                  Intent intent = new Intent(TopLevel.this,SeguimientoCategoryActivity.class);
                  startActivity(intent);

              }
              if (position == 2){
                  //lanzar la actividad
                  Intent intent = new Intent(TopLevel.this, ZonasCategoryActivity.class);
                  startActivity(intent);

              }
          }
        };
        //adicionar listener al list view
        ListView listView =(ListView) findViewById(R.id.lista_perfiles);
        listView.setOnItemClickListener(itemClickListener);


    }
}