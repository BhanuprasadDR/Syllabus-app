package com.example.example;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.Arrays;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=(ListView)findViewById(R.id.ttt);
String a[]={"5 semester","6 semester","7 semester","8 semester"};
ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,Arrays.asList(a));

     c.setAdapter(arrayAdapter);
     c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         Intent in=new Intent(MainActivity.this,MainActivity2.class);
         @Override

         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             if(position==0){
                 Toast.makeText(MainActivity.this,"semester 5 clicked",Toast.LENGTH_LONG).show();
                 String ab[]={"MANAGEMENT AND ENTREPRENEURSHIP FOR IT INDUSTRY","COMPUTER NETWORK AND SECURITY","DATABASE MANAGEMENT SYSTEM"
                         ,"AUTOMATA THEOTY AND COMPUTABILITY","APPLICATION DEVELOPMENT USING PYTHON","UNIX PROGRAMMING","COMPUTER NETWORK LABORATORY",
                         "DBMS LABORATORY WITH MINIPROJECT","ENVIRONMENTAL STUDIES"};

                 in.putExtra("g",ab);
                 in.putExtra("key",5);

             }
             if(position==1){
                 Toast.makeText(MainActivity.this,"semester 6 clicked",Toast.LENGTH_LONG).show();
                 String ab[]={"SYSTEM SOFTWARES AND COMPILERS","COMPUTER GRAPHICS AND VISUALIZATION","WEB TECHNOLOGY AND ITS APPLICATIONS",
                         "(PE)DATA MINING AND DATA WEREHOUSING","(PE)OBJECT ORIENTED MODELING AND DESIGN","(PE)CLOUD COMPUTING AND IT'S APPLICATION",
                         "(PE)ADVANCED JAVA AND J2EE","(PE)SYSTEM MODELLING AND SIMULATION","(OPEN ELECTIVE)MOBILE APPLICATION DEVELOPMENT",
                         "(OPEN ELECTIVE)INTRODUCTION TO DATA STRUCTURE AND ALGORITHM","(OPEN ELECTIVE)PROGRAMMING IN JAVA","(OPEN ELECTIVE)INTRODUCTION TO OPERATING SYSTEM",
                         "SYSTEM SOFTWARE LABORATORY","COMPUTER GRAPHICS LABORATORY WITH MINI PROJECT","MOBILE APPLICATION DEVELOPMENT"


                 };

                 in.putExtra("g",ab);
                 in.putExtra("key",6);
             }

                 startActivity(in);

         }
     });
    }
}