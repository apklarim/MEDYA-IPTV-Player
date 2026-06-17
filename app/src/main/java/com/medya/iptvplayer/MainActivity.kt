package com.medya.iptvplayer

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLive).setOnClickListener {
            Toast.makeText(this, "CANLI TV", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnMovies).setOnClickListener {
            Toast.makeText(this, "FILMLER", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnSeries).setOnClickListener {
            Toast.makeText(this, "DIZILER", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnSettings).setOnClickListener {
            Toast.makeText(this, "AYARLAR", Toast.LENGTH_SHORT).show()
        }
    }
}
