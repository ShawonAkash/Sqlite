package com.example.akashahmed.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editname , editsurename ,editmarks;
    Button btnaddData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        editname=(EditText) findViewById(R.id.editText_name);
        editsurename=(EditText) findViewById(R.id.editText_surname);
        editmarks=(EditText) findViewById(R.id.editText_marks);
        btnaddData=(Button) findViewById(R.id.button_add);
        AddData();
    }

    public  void AddData() {
        btnaddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editname.getText().toString(),
                                editsurename.getText().toString(),
                                editmarks.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
