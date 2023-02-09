package com.anas.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNextActivity;
        btnNextActivity=findViewById(R.id.btnNextActivity);

        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iM2S=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(iM2S);
            }
        });
    }
}