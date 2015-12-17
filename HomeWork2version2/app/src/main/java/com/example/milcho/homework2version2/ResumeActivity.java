package com.example.milcho.homework2version2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
    String locateAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        showMapBtn = (Button) findViewById(R.id.show_map);
        showMapBtn.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.text_empty);
        setText();

    }

    public void onClick(View v) {
        locateAddress ="geo:0.0?q="+getIntent().getStringExtra("Key3")+" "+getIntent().getStringExtra("Key4");
        Uri gmmIntentUri=Uri.parse(locateAddress);
        Intent mapIntent=new Intent(Intent.ACTION_VIEW,gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    private void setText() {
        Intent in = getIntent();
        String text1 = getIntent().getStringExtra("Key1");
        String text2 = getIntent().getStringExtra("Key2");
        String text3 = getIntent().getStringExtra("Key3");
        String text4 = getIntent().getStringExtra("Key4");
        textView.setText(text1 + "," + "\n" + text2 + "," + "\n" + text3 + "," + "\n" + text4);
    }
}
