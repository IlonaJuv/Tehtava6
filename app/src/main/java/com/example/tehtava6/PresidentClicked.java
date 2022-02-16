package com.example.tehtava6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PresidentClicked extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_clicked);

        Intent intent = getIntent();

        String nimi = intent.getStringExtra(MainActivity.NIMI);
        String aloitus = intent.getStringExtra(MainActivity.ALOITUSVUOSI);
        String lopetus = intent.getStringExtra(MainActivity.LOPETUSVUOSI);
        String kuvaus = intent.getStringExtra(MainActivity.KUVAUS);


        TextView aloitusText = findViewById(R.id.textAloitus);
        TextView lopetusText = findViewById(R.id.textLopetus);
        TextView nimiText = findViewById(R.id.textViewNimi);
        TextView kuvausText = findViewById(R.id.textKuvaus);


        nimiText.setText(nimi);
        lopetusText.setText(lopetus);
        aloitusText.setText(aloitus);
        kuvausText.setText(kuvaus);

    }


}