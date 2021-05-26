package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRegister(View view) {
        String fname="", lname="", email="";
        EditText txt_fname = findViewById(R.id.editTextFirstName);
        EditText txt_lname = findViewById(R.id.editTextLastName);
        EditText txt_mail = findViewById(R.id.editTextTextEmailAddress);

        TextView viewFname = findViewById(R.id.textView);
        TextView viewLname = findViewById(R.id.textView2);
        TextView viewEmail = findViewById(R.id.textView3);

        fname = txt_fname.getText().toString();
        lname = txt_lname.getText().toString();
        email = txt_mail.getText().toString();

        System.out.println("First Name:"+fname);
        System.out.println("Last Name:"+lname);
        System.out.println("Email address:"+email);

        viewFname.setText(fname);
        viewLname.setText(lname);
        viewEmail.setText(email);

    }
}