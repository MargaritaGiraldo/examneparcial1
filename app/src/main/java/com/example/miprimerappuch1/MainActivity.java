package com.example.miprimerappuch1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText nombre, apellido,género,edad,dirección,telefono;
    Button mostrar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.Nombre);
        apellido=(EditText) findViewById(R.id.Apellido);
        género=(EditText) findViewById(R.id.Género);
        edad=(EditText) findViewById(R.id.Edad);
        dirección=(EditText) findViewById(R.id.Dirección);
        telefono=(EditText) findViewById(R.id.Telefono);

        mostrar= (Button) findViewById(R.id.Mostrar);

        resultado=findViewById(R.id.resultado);
        mostrar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        public void onClick(View v) {
            nombre = nombre.getText().toString();
            apellido = apellido.getText().toString();
            género = género.getText().toString();
            edad = edad.getText().toString();
            dirección = dirección.getText().toString();


            int rta=0;

        switch (v.getId()){
            case R.id.Mostrar:
                resultado= +nombre+apellido,género,edad,dirección,telefono;
                break;



        }
        resultado.setText(""+rta);
    }
}
