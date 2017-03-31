package com.example.daniel.examen1_ortiz_yescas_vania_alice_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class actividad2 extends AppCompatActivity {

    TextView textRes;
    Double pesos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        textRes = (TextView) findViewById(R.id.textViewRes);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        pesos = recibe.getDouble("dolares");
    }

    public void onClickEnviar(View v)    {
        Intent correo = new Intent(Intent.ACTION_SEND);
        correo.setType("text/plain");
        correo.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        correo.putExtra(Intent.EXTRA_SUBJECT, "Asunto: examen 1er parcial");
        correo.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: "+ pesos);
        startActivity(correo);
    }
}
