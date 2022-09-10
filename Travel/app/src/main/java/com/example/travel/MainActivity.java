package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textname = findViewById(R.id.editTextName);
        EditText textcivilid =  findViewById(R.id.editTextcivilid);
        EditText textdest = findViewById(R.id.editTextdest);

        Button travel = findViewById(R.id.buttontravel);

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = textname.getText().toString();
                String b = textcivilid.getText().toString();
                String c = textdest.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", a);
                intent.putExtra("civilid", b);
                intent.putExtra("dest", c);
                startActivity(intent);

            }
        });
            }
}