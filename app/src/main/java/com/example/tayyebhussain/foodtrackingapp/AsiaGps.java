package com.example.tayyebhussain.foodtrackingapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class AsiaGps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_asia_gps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById (R.id.map);
        mapFragment.getMapAsync (this);


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in HTW-Berlin and move the camera
        LatLng HTW = new LatLng (52.457902, 	13.526683);
        mMap.addMarker (new MarkerOptions ().position (HTW)
                .title ("HTW-berlin"));

        mMap.moveCamera (CameraUpdateFactory.newLatLng (HTW));
        mMap.setMinZoomPreference (10.9f);
        mMap.setMaxZoomPreference (10.9f);



        LatLng Resturant = (new LatLng  (52.524280, 13.409620));
        mMap.addMarker (new MarkerOptions ().position (Resturant)
                .title ("Asian Resturant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        // mMap.moveCamera (CameraUpdateFactory.newLatLng (place1));
        mMap.addPolyline (new PolylineOptions ().add(
                HTW,
                Resturant

                )
                        .width (10)
                        .color (Color.RED)
        );

        if (ActivityCompat.checkSelfPermission (this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission (this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled (true);
    }
}