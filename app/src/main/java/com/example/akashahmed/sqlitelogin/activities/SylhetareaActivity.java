package com.example.akashahmed.sqlitelogin.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Akash Ahmed on 01-Apr-18.
 */

public class SylhetareaActivity extends AppCompatActivity {
    ListView lv;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhetarea);
        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        lv=(ListView) findViewById(R.id.lv);
        final String[] area={"Sylhet city","Sreemangal","Moulabibazar","Sunamganj"};
        ArrayAdapter adaptar=new ArrayAdapter(this,R.layout.lvlayout,R.id.txtid2,area);

        lv.setAdapter(adaptar);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"clicked on "+ area[i],Toast.LENGTH_SHORT).show();
                if(i==0){
                    Intent area=new Intent(view.getContext(),SylhetActivity.class);
                    startActivity(area);
                }
                if(i==1){
                    Intent area=new Intent(view.getContext(),Sreemangal.class);
                    startActivity(area);
                }
                if(i==2){
                    Intent area=new Intent(view.getContext(),Moulabibazar.class);
                    startActivity(area);
                }
                if(i==3){
                    Intent area=new Intent(view.getContext(),Sunamganj.class);
                    startActivity(area);
                }
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        if(Item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(Item);
    }
}
