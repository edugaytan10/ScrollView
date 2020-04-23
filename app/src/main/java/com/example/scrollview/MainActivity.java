package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //poner el icono en el actionbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    public void Seleccion(View view)
    {
        switch(view.getId())
        {
            case R.id.fresas:
                Toast.makeText(this, "Estas son fresas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manzana:
                Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pina:
                Toast.makeText(this, "Estas son piñas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sandia:
                Toast.makeText(this, "Estas son sandias", Toast.LENGTH_SHORT).show();
                break;
            case R.id.banana:
                Toast.makeText(this, "Estas son bananas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cereza:
                Toast.makeText(this, "Estas son cerezas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.kiwis:
                Toast.makeText(this, "Estas son kiwis", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mangos:
                Toast.makeText(this, "Estas son mangos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this, "Estas son melon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranja:
                Toast.makeText(this, "Estas son naranja", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pera:
                Toast.makeText(this, "Estas son peras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.zarzamora:
                Toast.makeText(this, "Estas son zarzamora", Toast.LENGTH_SHORT).show();
                break;
            case R.id.uvas:
                Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
