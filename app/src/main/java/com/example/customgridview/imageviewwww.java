package com.example.customgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class imageviewwww extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageviewwww);
        Intent intent = getIntent();
        imageView = findViewById(R.id.ivvv);
        textView = findViewById(R.id.tv_tv);
        imageView.setImageResource(intent.getIntExtra("imageurl",0));
        textView.setText( intent.getStringExtra("imageid"));
    }
}