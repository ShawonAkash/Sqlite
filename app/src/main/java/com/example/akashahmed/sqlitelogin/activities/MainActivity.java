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

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;

    Button txt;
    Button txt1;
    Button txt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(Button)findViewById(R.id.txtid2) ;
        txt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"clicked on Resourts ",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,ResourtsActivity.class);
                startActivity(i);
            }
        });
        txt1=(Button)findViewById(R.id.txtid) ;
        txt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Toast.makeText(getApplicationContext(),"clicked on Tourism area",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,Tourismarea.class);
                startActivity(i);
            }
        });
        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));


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
            Intent area=new Intent(MainActivity.this,UsersActivity.class);
            startActivity(area);
            return true;
        }
        if (id==R.id.contact){
            Toast.makeText(getApplicationContext(),"clicked on contact",Toast.LENGTH_SHORT).show();
            Intent area=new Intent(MainActivity.this,outofdhaka.class);
            startActivity(area);
            return true;
        }
        return true;
    }

}
