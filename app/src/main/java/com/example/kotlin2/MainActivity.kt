package com.example.kotlin2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate")

        findViewById<Button>(R.id.btFirst).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btShare).setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "HAHAHAHA")
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }

    override fun onStart() { super.onStart(); Log.d("MainActivity", "onStart") }
    override fun onResume() { super.onResume(); Log.d("MainActivity", "onResume") }
    override fun onPause() { super.onPause(); Log.d("MainActivity", "onPause") }
    override fun onStop() { super.onStop(); Log.d("MainActivity", "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d("MainActivity", "onDestroy") }
}