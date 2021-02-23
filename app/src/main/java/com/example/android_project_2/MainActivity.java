package com.example.android_project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView1;
    TextView myTextView2;
    SeekBar mySeekBar;
    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.myButton);
        myTextView1 = (TextView)findViewById(R.id.openStr);
        myTextView2 = (TextView)findViewById(R.id.closeStr);
        myEditText = (EditText)findViewById(R.id.editText);
    }

    public void buttonHandler(View v){
        myTextView2.setText(myEditText.getText().toString());

    }

}