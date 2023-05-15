package com.example.simplenavigateapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var home_button:Button
    lateinit var about_button:Button
    lateinit var blog_button:Button
    lateinit var services_button:Button
    lateinit var contact_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        home_button = findViewById(R.id.btnhome)
        home_button = findViewById(R.id.btnabout)
        home_button = findViewById(R.id.btnblog)
        home_button = findViewById(R.id.btnservices)
        home_button = findViewById(R.id.btncontact)

        home_button.setOnClickListener {
            var gotohome = Intent(this, HomeActivity::class.java)
            startActivity(gotohome)
        }

        about_button.setOnClickListener {
            var gotoabout = Intent(this, AboutActivity::class.java)
            startActivity(gotoabout)
        }

        blog_button.setOnClickListener {
            var gotoblog = Intent(this, BlogActivity::class.java)
            startActivity(gotoblog)
        }

        services_button.setOnClickListener {
            var gotoservices = Intent(this, ServicesActivity::class.java)
            startActivity(gotoservices)
        }

        contact_button.setOnClickListener {
            var gotocontact = Intent(this, ContactActivity::class.java)
            startActivity(gotocontact)
        }
    }
}