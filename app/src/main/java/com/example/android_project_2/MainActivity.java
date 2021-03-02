package com.example.android_project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    Button myButton;
    TextView myTextView1;
    TextView myTextView2;
    SeekBar mySeekBar;
    EditText myEditText;
    TextView sbText;
    Button upBtn;
    Button dwnBtn;
    Button vwBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.myButton);
        myTextView1 = (TextView)findViewById(R.id.openStr);
        myTextView2 = (TextView)findViewById(R.id.closeStr);
        myEditText = (EditText)findViewById(R.id.editText);
        mySeekBar = (SeekBar)findViewById(R.id.seekBar);
        sbText = (TextView)findViewById(R.id.sbText);
        upBtn = (Button)findViewById(R.id.upButton);
        dwnBtn = (Button)findViewById(R.id.downButton);
        vwBtn = (Button)findViewById(R.id.chgBtn);


        myEditText.addTextChangedListener(this);

        // MyTextWatcher myTextWatcher = new MyTextWatcher(myTextView1);
        // myEditText.addTextChangedListener(myTextWatcher);

//        myEditText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                myTextView1.setText(s);
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sbText.setText("Seek Bar Progress: " + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySeekBar.setProgress( mySeekBar.getProgress() + 1);
            }
        });

        dwnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySeekBar.setProgress( mySeekBar.getProgress() - 1);
            }
        });

        vwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PicView.class);
                MainActivity.this.startActivity(intent);
            }
        });


//        rtrn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.activity_main);
//            }
//        });


    }

    public void buttonHandler(View v){


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        myTextView1.setText(s + " :) :) :)");
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}