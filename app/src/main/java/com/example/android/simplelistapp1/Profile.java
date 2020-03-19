package com.example.android.simplelistapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        intent.getStringExtra("name");
        intent.getStringExtra("text");
        intent.getIntExtra("img" ,0);

        TextView tvName = findViewById(R.id.tvName);
        tvName.setText(intent.getStringExtra("name"));

        TextView tvText = findViewById(R.id.tvText);
        tvText.setText(intent.getStringExtra("text"));

        ImageView img = findViewById(R.id.img);
        img.setImageResource(intent.getIntExtra("img" ,0));
    }
}
