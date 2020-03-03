package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        List= (ListView)findViewById(R.id.List);

        ArrayList<String> array= new ArrayList<>();

        array.add("Android");
        array.add("iPhone");
        array.add("Windows");
        array.add("Blackberry");
        array.add("Linux");

        ArrayAdapter Adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,array);

        List.setAdapter(Adapter);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent List1= new Intent(ListActivity.this,DeviceDetailActivity.class);
                startActivity(List1);
            }
        });

    }
}
