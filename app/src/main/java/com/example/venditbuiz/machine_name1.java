package com.example.venditbuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class machine_name1 extends AppCompatActivity {
    private Button button,button1,button12,button111,buttonProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_name1);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button12 = (Button) findViewById(R.id.button12);
        button111 = (Button) findViewById(R.id.button111);
        buttonProfile = (Button) findViewById(R.id.btnProfile);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openproductPage();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openproductPage();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openproductPage();
            }
        });
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openproductPage();
            }
        });

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openProfile();
            }
        });
    }

    public void openproductPage()
    {
        Intent intent = new Intent(this, product_details1.class);
        startActivity(intent);
    }
    public  void openProfile()
    {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}