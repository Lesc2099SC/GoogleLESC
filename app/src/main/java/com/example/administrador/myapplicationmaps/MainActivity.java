package com.example.administrador.myapplicationmaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mapParque(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("LUGAR", "Parque");
        intent.putExtra("LATITUD",16.755159763524535);
        intent.putExtra("LONGITUD",-93.12358276394048);
        startActivity(intent);
    }

    public void mapZoo(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("LUGAR", "Zoologico");
        intent.putExtra("LATITUD",16.722154802088852);
        intent.putExtra("LONGITUD",-93.09120313671269);
        startActivity(intent);
    }

    public void mapPoli(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("LUGAR", "Poliforum");
        intent.putExtra("LATITUD",16.7487860723031);
        intent.putExtra("LONGITUD",-93.08073179271855);
        startActivity(intent);
    }

    public void mapMuseo(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("LUGAR", "Museo");
        intent.putExtra("LATITUD",16.759743676477214);
        intent.putExtra("LONGITUD",-93.10666338947453);
        startActivity(intent);
    }
}
