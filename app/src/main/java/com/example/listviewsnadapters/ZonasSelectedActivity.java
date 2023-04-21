package com.example.listviewsnadapters;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ZonasSelectedActivity extends AppCompatActivity {
    public static final String EXTRA_ZON = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonas);

        //Extraer nombre del diagnostico a mostrar
        int id = (Integer) getIntent().getExtras().get(EXTRA_ZON);
        Zonas zonas = Zonas.zonas[id];

        //mostrar layout
        TextView nombre3 = (TextView) findViewById(R.id.name3);
        nombre3.setText(zonas.getName());
        TextView description3 = (TextView) findViewById(R.id.description3);
        description3.setText(zonas.getDescription());
        ImageView img3 = (ImageView) findViewById(R.id.photo3);
        img3.setImageResource(zonas.getImageResourceId());
        img3.setContentDescription(zonas.getName());
    }
}
