package com.example.subiyantoroapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Browser
import android.util.Log
import android.view.View
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val actionbar = supportActionBar
        actionbar!!.title = "Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val followIg: ImageView = findViewById(R.id.follow_ig)
        val followTw: ImageView = findViewById(R.id.follow_twitter)

        followIg.setOnClickListener {
            val igProfile: String = "http://www.instagram.com/subiyantr"
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(igProfile))
            startActivity(browserIntent)
        }

        followTw.setOnClickListener {
            val twProfile: String = "http://www.twitter.com/subiyan_toro"
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(twProfile))
            startActivity(browserIntent)
        }
    }

}

