package com.example.administrador.myapplicationmaps;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public static Bundle extras;
    public static double dblLatitud;
    public static double dblLongitud;
    public static String strLugar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Intent i = getIntent();
        extras = i.getExtras();

        if (extras != null){

            dblLatitud = extras.getFloat("LATITUD");
            dblLongitud = extras.getFloat("LONGITUD");
            strLugar = extras.getString("LUGAR");
            Toast.makeText(MapsActivity.this, strLugar, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MapsActivity.this, "No Parameters in Activity", Toast.LENGTH_SHORT).show();
        }

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;





        // Add a marker in Sydney and move the camera
       // LatLng sydney = new LatLng(-34, 151);
        switch(strLugar){
            case "Parque":
                LatLng place1 = new LatLng(16.755159763524535, -93.12358276394048);
                mMap.addMarker(new MarkerOptions().position(place1).title("Parque de la marimba").icon(BitmapDescriptorFactory.fromResource(R.drawable.map_pin_48)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place1,13));
                break;
            case "Zoologico":
                LatLng place2 = new LatLng(16.72343507875467, -93.09544102695622);
                mMap.addMarker(new MarkerOptions().position(place2).title("Zoomat") .icon(BitmapDescriptorFactory.fromResource(R.drawable.lion_statue_48)) );
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place2,13));
                break;
            case "Poliforum":
                LatLng place3 = new LatLng(16.74877168919694, -93.08067814853825);
                mMap.addMarker(new MarkerOptions().position(place3).title("Poliforum") .icon(BitmapDescriptorFactory.fromResource(R.drawable.ticket_48)) );
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place3,13));
                break;
            case "Museo":
                LatLng place4 = new LatLng(16.759764222676214, -93.10664193180241);
                mMap.addMarker(new MarkerOptions().position(place4).title("Museo Regional") .icon(BitmapDescriptorFactory.fromResource(R.drawable.museum_48)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place4,13));
                break;


        }
        //LatLng place1 = new LatLng(16.755159763524535, -93.12358276394048);
        //LatLng place1 = new LatLng(dblLatitud, dblLongitud);

        //mMap.animateCamera(CameraUpdateFactory.zoomIn());


    }
}
