package com.example.android_project_2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

public class MyTextWatcher implements TextWatcher {
    TextView textView;

    public MyTextWatcher(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        textView.setText(s);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
