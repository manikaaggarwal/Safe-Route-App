package com.example.saferoute1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowPath extends AppCompatActivity {
    TextView tvSource, tvDestination;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_path);

        tvSource = 
        String source = getIntent().getStringExtra("from");
        String destination = getIntent().getStringExtra("to");

    }
}
