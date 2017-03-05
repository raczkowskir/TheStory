package com.yahoo.raczkowskir.thestory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    // zmienna do sprawdzania czy przycisk zostal klikniety
    int checker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton B1 = (ImageButton) findViewById(R.id.b1);
//przycik przenoszacy do nastepnego widoku i wlaczajacy nagranie glosowe
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sprawdzamy czy przycisk byl juz klikany
                if (checker == 0) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rr1);
                    mediaPlayer.start(); // no need to call prepare(); create() does that for you
//usypmiamy watek na 5 sekund, sluchamy nagrania i czekamy na pojawienie sie nastepnego widoku
                    try {
                        Thread.currentThread().sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    checker = 1;
                }
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });


    }
      /*  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "I will change this.", Snackbar.LENGTH_LONG)
                        .setAction("RR", null).show();
            }
        });*/


    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //niepotrzebna metoda
    public void doSomething() {
        System.out.print("Wyswietl coś.");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);

    }
}
