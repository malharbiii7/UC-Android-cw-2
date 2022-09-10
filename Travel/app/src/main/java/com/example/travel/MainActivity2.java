package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     Bundle bundle = getIntent().getExtras();
     String name = bundle.getString( "name");
     String civilid = bundle.getString("civilid");


        TextView textname = findViewById(R.id.textViewname2);
        TextView textcivilid = findViewById(R.id.textView3);


        textname.setText(name);
        textcivilid.setText(civilid);



    }
}