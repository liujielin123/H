package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button ace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ace = findViewById(R.id.button);
        ace.setOnClickListener(this);

        }
    public void onClick(View v) {
        TextView out = (TextView) findViewById(R.id.textView);
        EditText in = (EditText) findViewById(R.id.editTextTextPersonName);
        try {
            double tem = Double.valueOf(in.getText().toString());
            out.setText("result:" + (tem * 1.8 + 32));
        } catch (Exception e) {
            out.setText("result:error!!!please try again!");
        }
    }
    }