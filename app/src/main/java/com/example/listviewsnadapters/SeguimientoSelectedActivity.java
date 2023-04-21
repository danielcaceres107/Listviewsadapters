package com.example.listviewsnadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class SeguimientoSelectedActivity extends AppCompatActivity{
    public static final String EXTRA_SEG = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguimiento);

        //Extraer nombre del diagnostico a mostrar
        int id = (Integer) getIntent().getExtras().get(EXTRA_SEG);
        Seguimiento seguimientos = Seguimiento.seguimientos[id];

        //mostrar layout
        TextView nombre2 = (TextView) findViewById(R.id.name2);
        nombre2.setText(seguimientos.getName());
        TextView description2 = (TextView) findViewById(R.id.description2);
        description2.setText(seguimientos.getDescription());
        ImageView img2 = (ImageView) findViewById(R.id.photo2);
        img2.setImageResource(seguimientos.getImageResourceId());
        img2.setContentDescription(seguimientos.getName());
    }
}
