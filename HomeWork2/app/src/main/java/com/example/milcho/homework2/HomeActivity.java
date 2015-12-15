package com.example.milcho.homework2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterBtn;
    EditText nameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        enterBtn = (Button) findViewById(R.id.enter_btn);
        nameET = (EditText) findViewById(R.id.name);
        enterBtn.setOnClickListener(this);

    }

    public void onClick(View v) {
        String name=nameET.getText().toString();
        if (v.getId() == enterBtn.getId()&& !name.isEmpty() ) {
            Intent in = new Intent(this, DetailsActivity.class);
            in.putExtra("Key1", nameET.getText().toString());

            startActivity(in);

        } else {
            nameET.setError("text");
        }
    }
}
