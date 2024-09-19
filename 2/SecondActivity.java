package com.jfdimarzio.savanhw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import  androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText enter_Fullname, enter_Phonenumber, enter_Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button saveButton = findViewById(R.id.saveButton);

        enter_Fullname = (EditText) findViewById(R.id.enter_text_Fullname);
        enter_Phonenumber = (EditText) findViewById(R.id.enter_text_Phonenumber);
        enter_Email = (EditText) findViewById(R.id.enter_text_Email);


        saveButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String strFullname = enter_Fullname.getText().toString();
                String strPhonenumber = enter_Phonenumber.getText().toString();
                String strEmail = enter_Email.getText().toString();
                Intent activityIntent = new Intent(getApplicationContext(), MainActivity.class);
                activityIntent.putExtra("temp_fullname", strFullname);
                activityIntent.putExtra("temp_phonenumber", strPhonenumber);
                activityIntent.putExtra("temp_email", strEmail);
                startActivity(activityIntent);

            }
        });

    }

}
