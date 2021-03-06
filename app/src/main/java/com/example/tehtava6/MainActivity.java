package com.example.tehtava6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public final static String NIMI = "moi";
    public final static String ALOITUSVUOSI = "0";
    public final static String LOPETUSVUOSI = "12";
    public final static String KUVAUS = "kiva";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("DBG", Presidents.getInstance().getTiedot().toString());
        ListView lv = findViewById(R.id.lista);

        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Presidents.getInstance().getNimet()));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("DBG", "Alkio " + l + " valittu");

                Intent intent = new Intent(MainActivity.this, PresidentClicked.class);

                President nimiString = Presidents.getInstance().getTiedot().get(i);

                intent.putExtra(NIMI, nimiString.getNimi());
                intent.putExtra(ALOITUSVUOSI, nimiString.getAloitus());
                intent.putExtra(LOPETUSVUOSI, nimiString.getLopetus());
                intent.putExtra(KUVAUS, nimiString.getKuvaus());

                startActivity(intent);
            }
        });

    }


}