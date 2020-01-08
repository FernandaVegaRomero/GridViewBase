package com.example.gridviewbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;
    Contenido contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvContenedor);

        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("Fernando");
        arreglo.add("Francisco");
        arreglo.add("Saul");
        arreglo.add("Josue");
        arreglo.add("Juampa");
        arreglo.add("Maria");
        arreglo.add("Emily");
        arreglo.add("Yubin");
        arreglo.add("Israel");
        arreglo.add("Denis");

        contenido = new Contenido(this, arreglo);
        gvdatos.setAdapter(contenido);

    }
}
