package com.example.recyclerviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager);

        List<String> mList = new ArrayList<>();
        mList.add("Kaise ho hello");
        mList.add("aap kaise ho");
        mList.add("tum kaise ho");
        mList.add("mai kaise hu");
        mList.add("heyyyyyyyyy");
        mList.add("hello ");
        mList.add("aaap kais eho");
        mList.add("ghumne chalo");
        mList.add("nahiii aaunga");
        mList.add("rehne dooo");
        mList.add("oooooooooooooooooooook");
        mList.add("bhaago");

        viewpagerAdapter viewpagerAdapter= new viewpagerAdapter(mList,getApplicationContext());
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);

        

    }
}