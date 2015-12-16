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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        showMapBtn = (Button) findViewById(R.id.show_map);
        showMapBtn.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.text_empty);
        String text1 = getIntent().getStringExtra("Key1");
        String text2 = getIntent().getStringExtra("Key2");
        String text3 = getIntent().getStringExtra("Key3");
        String text4 = getIntent().getStringExtra("Key4");
        textView.setText(text1 + ","+"\n" + text2 + ","+"\n" + text3 + ","+"\n" + text4);

    }

    public void onClick(View v) {
        String text3 = getIntent().getStringExtra("Key3");
        String text4 = getIntent().getStringExtra("Key4");
        if (v.getId() == showMapBtn.getId()) {
            Intent in = new Intent(this, MapsActivity.class);
            in.putExtra("Map1", text3);
            in.putExtra("Map2", text4);
            startActivity(in);


        }
    }
}
