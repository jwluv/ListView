package com.lyna.www.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listViewFruit;
    String[] fruits = new String[]{"Apple", "Avocado", "Banana", "Blueberry"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewFruit = findViewById(R.id.listViewFruit);

        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview_single_column, fruits);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits);
        listViewFruit.setAdapter(arrayAdapter);
        listViewFruit.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(getApplicationContext(), "onitemclick", Toast.LENGTH_SHORT).show();
        Intent intent = null;
        String selected = ((TextView)view).getText().toString();

        switch(selected) {
            case "Apple":
                intent = new Intent(this, AppleActivity.class);
                break;
            case "Avocado":
                intent = new Intent(this, AvocadoActivity.class);
                break;
            case "Blueberry":
                intent = new Intent(this, BlueberryActivity.class);
                break;
            case "Banana":
                intent = new Intent(this, BananaActivity.class);
                break;

        }
        startActivity(intent);
    }
}
