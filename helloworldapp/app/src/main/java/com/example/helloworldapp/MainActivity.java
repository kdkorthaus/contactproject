package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloView;
    private Button button;
    private EditText nameEdit;
    private EditText numberEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloView = findViewById(R.id.helloView);
        button = findViewById(R.id.button);
        nameEdit = findViewById(R.id.nameEdit);
        numberEdit = findViewById(R.id.numberEdit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEdit.getText().toString();
                int num = Integer.parseInt(numberEdit.getText().toString());
                helloView.setText("Hello, "+name+"!\nYour favorite number is "+num);
            }
        });
}}