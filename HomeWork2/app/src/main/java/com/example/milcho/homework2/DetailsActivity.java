package com.example.milcho.homework2;

import android.content.Intent;
import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    EditText ageET;
    EditText addressET;
    EditText cityET;
    EditText dateOfBirthET;
    Button forwordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        forwordBtn = (Button) findViewById(R.id.forword);
        forwordBtn.setOnClickListener(this);
        ageET = (EditText) findViewById(R.id.age);
        addressET = (EditText) findViewById(R.id.address);
        cityET = (EditText) findViewById(R.id.city);
        dateOfBirthET = (EditText) findViewById(R.id.data_of_birth);

    }

    public void onClick(View v) {
        String age = ageET.getText().toString();
        String address = addressET.getText().toString();
        String city = cityET.getText().toString();
        String dateOfBirth = dateOfBirthET.getText().toString();
        if (age.isEmpty()) {
            ageET.setError("text");
        } else if (address.isEmpty()) {
            addressET.setError("text");
        } else if (city.isEmpty()) {
            cityET.setError("text");
        } else if (dateOfBirth.isEmpty()) {
            dateOfBirthET.setError("text");
        } else if (!age.isEmpty() || !address.isEmpty() || !city.isEmpty() || !dateOfBirth.isEmpty()) {
            Intent in = new Intent(this, ResumeActivity.class);
            in.putExtra("Key1", getIntent().getStringExtra("Key1"));
            in.putExtra("Key2", ageET.getText().toString());
            in.putExtra("Key3", addressET.getText().toString());
            in.putExtra("Key4", cityET.getText().toString());
            startActivity(in);
        }
    }
}
