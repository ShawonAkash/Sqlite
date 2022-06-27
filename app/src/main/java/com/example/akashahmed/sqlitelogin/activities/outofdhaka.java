package com.example.akashahmed.sqlitelogin.activities;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Akash Ahmed on 01-Apr-18.
 */

public class outofdhaka extends AppCompatActivity {
    ActionBar actionBar;
    EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outofdhaka);
        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        edit=(EditText) findViewById(R.id.editText);
    }

    public void sendButton(View V){
        Intent i = new Intent() ;
        i.setAction(Intent.ACTION_SEND);
        i.setType("text/plain");
        String[] arr={"akash15-4883@diu.edu.bd"};
        i.putExtra(Intent.EXTRA_EMAIL,arr);
        i.putExtra(Intent.EXTRA_SUBJECT,"Contact Us");
        String body= edit.getText().toString();
        i.putExtra(Intent.EXTRA_TEXT,body);

        if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        if(Item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(Item);
    }
}
