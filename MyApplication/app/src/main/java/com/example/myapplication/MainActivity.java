package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etfirtnumber = findViewById(R.id.editTextTextfirstnumber);
        EditText etsecondnumber = findViewById(R.id.editTextsecondnumber);
        TextView textResult = findViewById(R.id.textViewResult);
        Button calc = findViewById(R.id.buttonCalc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texta = etfirtnumber.getText().toString();
                int x = Integer.parseInt(texta);

                String textb = etsecondnumber.getText().toString();
                int y = Integer.parseInt(textb);

                int z = sum (x,y);

                textResult.setText(String.valueOf(z));

            }
        });
    }

    public int sum(int x, int y){

        int a = x + y;
        return a;
    }
}