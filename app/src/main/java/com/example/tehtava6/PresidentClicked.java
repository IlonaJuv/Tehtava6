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
        TextView nimiText = findViewById(R.id.textViewNimi);
        nimiText.setText(nimi);

        String aloitus = intent.getStringExtra(MainActivity.ALOITUSVUOSI);
        TextView aloitusText = findViewById(R.id.textAloitus);
        aloitusText.setText(aloitus);

        String lopetus = intent.getStringExtra(MainActivity.LOPETUSVUOSI);
        TextView lopetusText = findViewById(R.id.textLopetus);
        lopetusText.setText(lopetus);

        String kuvaus = intent.getStringExtra(MainActivity.KUVAUS);
        TextView kuvausText = findViewById(R.id.textKuvaus);
        kuvausText.setText(kuvaus);


    }


}