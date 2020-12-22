package com.example.recyclerviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager);

        List<itemDataModel> mList = new ArrayList<>();
        mList.add(new itemDataModel("first","Kaise ho hello"));
        mList.add(new itemDataModel("second","mai thik hu hello"));
        mList.add(new itemDataModel("third","chala ja bhai tu, ghar"));
        mList.add(new itemDataModel("fourth","aaj maine breakup"));
        mList.add(new itemDataModel("fifth","ki party rakh li hai"));
        mList.add(new itemDataModel("sixth","binod ke ghar se dharu mangwa li hai"));


        viewpagerAdapter viewpagerAdapter= new viewpagerAdapter(mList,getApplicationContext());
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        viewPager2.setAdapter(viewpagerAdapter);

        //to check if page is selected or not
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Log.d("viewpgaer2page","selected page "+position);

                //setting toolbar title according page
                //setTitle(mList.get(position).tabTitle);
            }
        });


        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE); //making tab scrollable

        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> tab.setText(mList.get(position).tabTitle)
        ).attach();




    }
}