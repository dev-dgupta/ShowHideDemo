package com.example.showandhideelementdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void showElem(View view) {
        textView.setVisibility(View.VISIBLE);

    }

    public void hideElem(View view) {
        textView.setVisibility(View.INVISIBLE);
    }
}