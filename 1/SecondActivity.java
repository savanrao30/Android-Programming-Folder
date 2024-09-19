package com.jfdimarzio.homework1by2784780;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class SecondActivity extends Activity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
    public void onClick(View view) {
        finish();
    }
}


