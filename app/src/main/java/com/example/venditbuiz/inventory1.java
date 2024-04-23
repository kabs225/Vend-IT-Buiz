package com.example.venditbuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inventory1 extends AppCompatActivity {

    private Button buttonback,buttonproductdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory1);
        buttonback = (Button) findViewById(R.id.btnBack);
        buttonproductdetails = (Button) findViewById(R.id.btnProductdetails);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openmachineselection();
            }
        });
        buttonproductdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openProductdetails();
            }
        });
    }
    public void openmachineselection()
    {
        Intent intent = new Intent(this, machine_name1.class);
        startActivity(intent);
    }
    public void openProductdetails()
    {
        Intent intent = new Intent(this, product_details1.class);
        startActivity(intent);
    }
}