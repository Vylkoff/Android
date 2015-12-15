package com.example.milcho.homework2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

public class ResumeActivity extends AppCompatActivity implements View.OnClickListener {
    Button showMapBtn;
    TextView textView;
    EditText nameET;
    EditText ageET;
    EditText addressET;
    EditText cityET;
    EditText dateOfBirthET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        showMapBtn = (Button) findViewById(R.id.show_map);
        showMapBtn.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.text_empty);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout1 = layoutInflater.inflate(R.layout.activity_home, null);
        View layout2 = layoutInflater.inflate(R.layout.activity_details, null);
        nameET = (EditText) layout1.findViewById(R.id.name);
        ageET = (EditText) layout2.findViewById(R.id.age);
        addressET = (EditText) layout2.findViewById(R.id.address);
        cityET = (EditText) layout2.findViewById(R.id.city);
        String text1 = getIntent().getStringExtra("Key5");
        String text2 = getIntent().getStringExtra("Key2");
        String text3 = getIntent().getStringExtra("Key3");
        String text4 = getIntent().getStringExtra("Key4");
        textView.setText(text1 + ", " + text2 + ", " + text3 + ", " + text4);

    }

    public void onClick(View v) {
        if (v.getId() == showMapBtn.getId()) {
            Intent in = new Intent(this, MapsActivity.class);
            startActivity(in);


        }
    }
}
