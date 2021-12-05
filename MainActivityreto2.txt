package com.example.dcjacketsdesingreto2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 *
 *
 * @author Cristian Vásquez
 */

public class MainActivity extends AppCompatActivity {
    Fragment subPantalla1, subPantalla2, subPantalla3, subPantallaInicio, subPantallaF;
    FragmentTransaction intercambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subPantalla1 = new fragment_productos();
        subPantalla2 = new fragment_servicios();
        subPantalla3 = new fragment_sucursales();
        subPantallaInicio = new fragment_inicio();
        subPantallaF = new fragment_favoritos();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragments, subPantallaInicio).commit();

    }
    //****************************************** MENU DE OPCIONES ***************************************************
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.productos){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla1).commit();
            Toast.makeText(getApplicationContext(), "Productos", Toast.LENGTH_LONG ).show();
        }
        if (id == R.id.servicios){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla2).commit();
            Toast.makeText(getApplicationContext(), "Servicios", Toast.LENGTH_LONG ).show();
        }
        if (id == R.id.sucursales){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla3).commit();
            Toast.makeText(getApplicationContext(), "Sucursales", Toast.LENGTH_LONG ).show();
        }
        if (id == R.id.inicio){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantallaInicio).commit();
            Toast.makeText(getApplicationContext(), "Inicio", Toast.LENGTH_LONG ).show();
        }
        if (id == R.id.favoritos){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantallaF).commit();
            Toast.makeText(getApplicationContext(), "Favoritos", Toast.LENGTH_LONG ).show();
        }
        return super.onOptionsItemSelected(item);
    }
    //*****************************************************************************************************************
}