package com.example.subiyantoroapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.R.id
import android.content.Intent
import android.graphics.drawable.Drawable
import org.w3c.dom.Text


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE = "EXTRA_IMAGE"
        const val EXTRA_TITLE = "EXTRA_TITLE"
        const val EXTRA_DETAIL = "EXTRA_DETAIL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val heroName = intent.getStringExtra(EXTRA_TITLE)
        val heroImage = intent.getIntExtra(EXTRA_IMAGE, R.drawable.naruto)
        val heroDetail = intent.getStringExtra(EXTRA_DETAIL)
//        val drawableImage = getResources().getIdentifier(heroImage, "drawable", getPackageName());

        val heroPhoto: ImageView = findViewById(R.id.hero_image)
        val heroTitle: TextView = findViewById(R.id.hero_name)
        val heroBody: TextView = findViewById(R.id.hero_detail)

        heroTitle.text = heroName
        heroBody.text = heroDetail
        heroPhoto.setImageResource(heroImage)

        val actionbar = supportActionBar
        actionbar!!.title = heroName
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
