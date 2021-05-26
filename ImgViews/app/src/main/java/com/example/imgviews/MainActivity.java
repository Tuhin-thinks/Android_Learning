package com.example.imgviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView citiesList;
    private Spinner students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        students = findViewById(R.id.StudentSpinner);

        ArrayList<String> students_list = new ArrayList<>();
        students_list.add("Tuhin");
        students_list.add("Ramesh");
        students_list.add("Gopal");
        students_list.add("Ram");
        students_list.add("Hari");


        final ArrayList<String> cities = new ArrayList<>();

        // data to cities list generally comes from webserver

        cities.add("Kolkata");
        cities.add("Delhi");
        cities.add("Odisha");
        cities.add("Karnataka");
        cities.add("Bangalore");
        cities.add("Assam");
        cities.add("Bihar");
        cities.add("Punjab");
        cities.add("Uttar Pradesh");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, students_list);
        students.setAdapter(studentsAdapter);

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );
        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}