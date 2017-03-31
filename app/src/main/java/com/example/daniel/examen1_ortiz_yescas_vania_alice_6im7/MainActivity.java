package com.example.daniel.examen1_ortiz_yescas_vania_alice_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText escrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        escrito = (EditText) findViewById(R.id.editText);

    }

    public void onClickConvertir(View v) {
        Intent envia = new Intent(this, actividad2.class);
        Bundle datos = new Bundle();
        datos.putDouble("dolares", (Double.parseDouble(escrito.getText().toString().trim())/15));
        envia.putExtras(datos);
        finish();;
        startActivity(envia);
    }
}
