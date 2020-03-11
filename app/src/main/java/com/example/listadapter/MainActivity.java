package com.example.listadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Started...");

        ListView listView = findViewById(R.id.listView);

        //create person object
        Person nancy = new Person("Nancy", "02-05-1992", "Female");
        Person john = new Person("John", "22-05-1990", "Male");
        Person lisa = new Person("Lisa", "20-02-1998", "Female");
        Person joyce = new Person("Joyce", "01-08-2000", "Female");
        Person james = new Person("James", "06-01-2015", "Male");
        Person tony = new Person("Tony", "16-12-1998", "Male");
        Person hesbon = new Person("Hesbon", "28-02-2020", "Male");
        Person nehemiah = new Person("Nehemiah", "31-06-2007", "Male");
        Person june = new Person("June", "10-03-1987", "Female");
        Person hannah = new Person("Hannah", "19-04-1989", "Female");
        Person michelle = new Person("Michelle", "20-10-1988", "Female");

        //create array list
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(nancy);
        peopleList.add(john);
        peopleList.add(lisa);
        peopleList.add(joyce);
        peopleList.add(james);
        peopleList.add(tony);
        peopleList.add(hesbon);
        peopleList.add(nehemiah);
        peopleList.add(june);
        peopleList.add(hannah);
        peopleList.add(michelle);

        //create personListAdapter
        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        listView.setAdapter(adapter);
    }
}
