package com.example.venditbuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class product_details1 extends AppCompatActivity {
    private Button buttonback,buttoninventory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details1);
        buttonback = (Button) findViewById(R.id.btnBack);
        buttoninventory = (Button) findViewById(R.id.btnInventory);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openmachineselection();
            }
        });
        buttoninventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openinventory();
            }
        });
    }
    public void openmachineselection()
    {
        Intent intent = new Intent(this, machine_name1.class);
        startActivity(intent);
    }
    public void openinventory()
    {
        Intent intent = new Intent(this, inventory1.class);
        startActivity(intent);
    }
}