package com.example.milcho.homework2;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout2 = layoutInflater.inflate(R.layout.activity_details, null);
        EditText addressET = (EditText) layout2.findViewById(R.id.address);
        EditText cityET = (EditText) layout2.findViewById(R.id.city);
        String text1 = getIntent().getStringExtra("KeyMap1");
        String text2 = getIntent().getStringExtra("KeyMap2");
        String locationS = text1 + ", " + text2;
        List<Address>  address = null;
        if (locationS != null || !locationS.equals("")) {
            Geocoder geocoder = new Geocoder(this);
            try {
                address = geocoder.getFromLocationName(locationS, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Address location = address.get(0);
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        }
        Address location = address.get(0);
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        //  setUpMapIfNeeded();
    }

/*    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();

    }

    private void setUpMapIfNeeded() {
        if (mMap == null) {
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        }
        if (mMap != null) {
            setUpMap();
        }
    }

    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
        mMap.setMyLocationEnabled(true);
    }


    public void onSearch() {
        EditText location1 = (EditText) findViewById(R.id.address);
        String location = location1.getText().toString();
        List<Address> addressList = null;
        if (location != null || !location.equals("")) {
            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Address address = addressList.get(0);
            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
        }
        Address address = addressList.get(0);
        LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
        mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));


    } */
}
