package com.example.multiline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnMultiline).setOnClickListener {
            findViewById<EditText>(R.id.textMultiline).setText(R.string.hardcode)
        }
        findViewById<Button>(R.id.btnLine).setOnClickListener {
            findViewById<EditText>(R.id.plainText).setText(R.string.hardcode)
        }
    }
}

