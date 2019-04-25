package com.myapplicationdev.android.tw_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<year> al;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);


        al = new ArrayList<year>();
        al.add(new year("Year 1"));
        al.add(new year("Year 2"));
        al.add(new year("Year 3"));

        aa = new yearAdapter(this,R.layout.year_row, al);
        lv.setAdapter(aa);





    }
}
