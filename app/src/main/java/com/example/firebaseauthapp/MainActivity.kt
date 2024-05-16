package com.example.firebaseauthapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)


        val nextButton: Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener {
            // Start the next activity
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
