package com.example.displayprofiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //images description as string and attaching images to code
    private String[] names = {"Botswana","Lesotho","Mozambique","Namibia","South Africa","eSwatini","Zambia","Zimbabwe"};
    private int[] images = {R.drawable.bw,R.drawable.ls,R.drawable.mz,R.drawable.nb,R.drawable.sa,R.drawable.sd,R.drawable.za,R.drawable.zm};
    private List<Country> countryList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.home_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        prepareTheList();
        RecycleAdapter adapter = new RecycleAdapter(countryList);
        recyclerView.setAdapter(adapter);
    }

    private void prepareTheList()
    {
        int count = 0;
        for(String name : names){
            Country country = new Country(name, images[count]);
            countryList.add(country);
            count++;

        }
    }
}