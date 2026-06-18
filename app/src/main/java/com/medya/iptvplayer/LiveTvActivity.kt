package com.medya.iptvplayer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LiveTvActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_tv)

        findViewById<Button>(R.id.btnM3u).setOnClickListener {
            startActivity(Intent(this, M3uActivity::class.java))
        }

        findViewById<Button>(R.id.btnXtream).setOnClickListener {
            startActivity(Intent(this, XtreamActivity::class.java))
        }

        findViewById<Button>(R.id.btnMag).setOnClickListener {
            startActivity(Intent(this, MagActivity::class.java))
        }
    }
}
