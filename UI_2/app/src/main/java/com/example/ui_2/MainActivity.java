package com.example.ui_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxHarry, checkBoxMatrix, checkBoxBatMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxHarry = findViewById(R.id.checkBoxHarry);
        checkBoxMatrix = findViewById(R.id.checkBoxMatrix);
        checkBoxBatMan = findViewById(R.id.checkBoxBatMan);

        if (checkBoxHarry.isChecked())
            Toast.makeText(this, "You have watched Harry potter!", Toast.LENGTH_SHORT).show();
        if (checkBoxMatrix.isChecked())
            Toast.makeText(this, "You have watched Matrix!", Toast.LENGTH_SHORT).show();
        if (checkBoxBatMan.isChecked())
            Toast.makeText(this, "You have watched Bat Man!", Toast.LENGTH_SHORT).show();

    }
}