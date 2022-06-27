package com.example.akashahmed.sqlitelogin.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Akash Ahmed on 01-Apr-18.
 */

public class Tourismarea extends AppCompatActivity {
    ListView lv;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourismarea);

        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        lv=(ListView) findViewById(R.id.lv);
        final String[] area={"Dhaka","Khulna","Sylhet","Chittagong","Rajshahi","Barisal","Rongpur"};
        ArrayAdapter adaptar=new ArrayAdapter(this,R.layout.lvlayout,R.id.txtid2,area);

        lv.setAdapter(adaptar);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"clicked on "+ area[i],Toast.LENGTH_SHORT).show();
                if(i==0){
                    Intent area=new Intent(view.getContext(),DhakaActivity.class);
                    startActivity(area);
                }
                if(i==1){
                    Intent area=new Intent(view.getContext(),KhulnaActivity.class);
                    startActivity(area);
                }
                if(i==2){
                    Intent area=new Intent(view.getContext(), com.example.akashahmed.sqlitelogin.activities.SylhetareaActivity.class);
                    startActivity(area);
                }
                if(i==3){
                    Intent area=new Intent(view.getContext(),ChittagongActivity.class);
                    startActivity(area);
                }
                if(i==4){
                    Intent area=new Intent(view.getContext(),RajshahiActivity.class);
                    startActivity(area);
                }
                if(i==5){
                    Intent area=new Intent(view.getContext(),BarishalActivity.class);
                    startActivity(area);
                }
                if(i==6){
                    Intent area=new Intent(view.getContext(), com.example.akashahmed.sqlitelogin.activities.RangpurActivity.class);
                    startActivity(area);
                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        int id=Item.getItemId();
        if (id==R.id.info){
            Toast.makeText(getApplicationContext(),"clicked on info",Toast.LENGTH_SHORT).show();
            Intent area=new Intent(Tourismarea.this,outofdhaka.class);
            startActivity(area);
            return true;
        }
        if (id==R.id.contact){
            Toast.makeText(getApplicationContext(),"clicked on contact",Toast.LENGTH_SHORT).show();
            Intent area=new Intent(Tourismarea.this,outofdhaka.class);
            startActivity(area);
            return true;
        }
        if(Item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(Item);


    }


}
