package com.duyuqian.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_frame = findViewById(R.id.button2);
        button_frame.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, FrameActivity.class);
                        startActivity(intent);
                    }
                }
        );

        Button button_constraint = findViewById(R.id.button1);
        button_constraint.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, ConstraintActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}