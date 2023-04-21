package com.example.listviewsnadapters;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DiagnosticoSelectedActivity extends AppCompatActivity {

    public static final String EXTRA_DIAG = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);

        //Extraer nombre del diagnostico a mostrar
        int id =(Integer) getIntent().getExtras().get(EXTRA_DIAG);

        Diagnostico diagnosticos = Diagnostico.diagnosticos[id];
        //mostrar layout
        TextView nombre= (TextView) findViewById(R.id.name);
        nombre.setText(diagnosticos.getName());
        TextView description= (TextView) findViewById(R.id.description);
        description.setText(diagnosticos.getDescription());
        ImageView img = (ImageView) findViewById(R.id.photo);
        img.setImageResource(diagnosticos.getImageResourceId());
        img.setContentDescription(diagnosticos.getName());



    }
}