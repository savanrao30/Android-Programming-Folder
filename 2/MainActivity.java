package com.jfdimarzio.savanhw2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display_Fullname, display_Phonenumber, display_Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAdd = findViewById(R.id.buttonAdd);

        display_Fullname = (TextView) findViewById(R.id.enter_fullname);
        display_Phonenumber = (TextView) findViewById(R.id.enter_phonenumber);
        display_Email = (TextView) findViewById(R.id.enter_email);

        Intent intent = getIntent();
        String str_fullname = intent.getStringExtra("temp_fullname");
        String str_phonenumber = intent.getStringExtra("temp_phonenumber");
        String str_email = intent.getStringExtra("temp_email");
        display_Fullname.setText(str_fullname);
        display_Phonenumber.setText(str_phonenumber);
        display_Email.setText(str_email);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent activity2Intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(activity2Intent);
            }
        });


    }
}
