package com.jfdimarzio.homework4by2784780

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var linear: Button
    lateinit var table: Button
    lateinit var relative: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linear = findViewById(R.id.Linearlayout)
        relative = findViewById(R.id.Relativelay)
        table = findViewById(R.id.Tablelayout)

        linear.setOnClickListener {
            val intent = Intent(this@MainActivity, LinearLayout::class.java)
            startActivity(intent)
        }

        relative.setOnClickListener {
            val intent = Intent(this@MainActivity, RelativeLayout::class.java)
            startActivity(intent)
        }

        table.setOnClickListener {
            val intent = Intent(this@MainActivity, TableLayout::class.java)
            startActivity(intent)
        }
    }
}
