package com.example.kotlin2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        Log.d("second activity", "onCreate")

        findViewById<TextView>(R.id.tv_second).text = getString(R.string.welcome_to_secondactivity)

        findViewById<Button>(R.id.btBack).setOnClickListener {
            finish()
        }
    }

    override fun onStart() { super.onStart(); Log.d("second activity", "onStart") }
    override fun onResume() { super.onResume(); Log.d("second activity", "onResume") }
    override fun onPause() { super.onPause(); Log.d("second activity", "onPause") }
    override fun onStop() { super.onStop(); Log.d("second activity", "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d("second activity", "onDestroy") }
}