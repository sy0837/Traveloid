package com.example.traveloid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Search extends AppCompatActivity {
    int images[]={R.drawable.dubai,R.drawable.mountain,R.drawable.london,R.drawable.bangkok};
    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        grid=findViewById(R.id.grid1);


    }
}
