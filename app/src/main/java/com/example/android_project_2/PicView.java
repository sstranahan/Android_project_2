package com.example.android_project_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PicView extends AppCompatActivity {

    Button rtrn;

    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);

        rtrn = (Button)findViewById(R.id.rtrn);

        rtrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicView.this, MainActivity.class);
                PicView.this.startActivity(intent);
            }
        });
    }
}
