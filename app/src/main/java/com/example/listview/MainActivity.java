package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = {"Apple1", "Banana1", "BlueBerry1", "Cherry1", "Mango1",
                "Apple2", "Banana2", "BlueBerry2", "Cherry2", "Mango2",
                "Apple3", "Banana3", "BlueBerry3", "Cherry3", "Mango3",
                "Apple4", "Banana4", "BlueBerry4", "Cherry4", "Mango4" };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                String str = (String) adapterView.getAdapter().getItem(pos);
                Toast.makeText(getApplicationContext(), str + "선택", Toast.LENGTH_SHORT).show();
            }
        });
    }
}