package com.jfdimarzio.homework1by2784780;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView back;
    int count = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view) {
        startActivity(new Intent("com.jfdimarzio.homework1by2784780.SecondActivity"));

    }
    @SuppressLint("SetTextI18n")
    public void onRestart() {
        super.onRestart();
        back = findViewById(R.id.countback);
        back.setText("Count = " + count);
        count++;
    }
}
