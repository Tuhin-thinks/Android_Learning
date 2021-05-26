package com.example.ui_basics;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int click_count;
    private TextView txtWelcome;
    private EditText edtTxtName;


    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPress:
                click_count ++;
                String name = edtTxtName.getText().toString();
                txtWelcome.setText("You pressed the button " + click_count + " times! " + name + "...");
                break;
            case R.id.edtName:
                Toast.makeText(this, "Editing something...", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPress = findViewById(R.id.btnPress);
        btnPress.setOnClickListener(this);

        btnPress.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                click_count+=2;
                Toast.makeText(MainActivity.this, "Long Pressing, clicked: " + click_count + " times", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        edtTxtName = findViewById(R.id.edtName);
        txtWelcome = findViewById(R.id.txtWelcome);

        }
    }