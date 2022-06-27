package com.example.akashahmed.sqlitelogin.activities;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

/**
 * Created by Akash Ahmed on 01-Apr-18.
 */

public class SylhetActivity extends AppCompatActivity {
    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Ratargul Swap Forest(Sylhet City)","Jaflong(Sylhet City)","Bisnakandi(Sylhet City)","Shahjalal Dorga(Sylhet City)","Ali Amjad Clock Tower(Sylhrt City)","Pangthumai Waterfall(Sylhet City)","Rema-Kalenga Wildlife Sanctuary(Sylhetcity)"};
        int[] areaimz={R.drawable.ratargul,R.drawable.jaflong,R.drawable.bisanakandi,R.drawable.dorga,R.drawable.aliamjad,R.drawable.pangthumai,R.drawable.remakalenga};
        sylhetlistview myadapt=new sylhetlistview(this,dhakaarea,areaimz);
        mylist.setAdapter(myadapt);
        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        if(Item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(Item);
    }
}
