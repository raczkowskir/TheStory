package com.yahoo.raczkowskir.thestory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
String a = "activity_main2v1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //tworzymy dwie zmienne przycisków
        final Button Odp1 = (Button) findViewById(R.id.odp1);
        final Button Odp2 = (Button) findViewById(R.id.odp2);

        Odp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                setContentView(R.layout.activity_main2v1);


            }
        });

        Odp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                setContentView(R.layout.activity_main2v2);


            }
        });

    }
}
