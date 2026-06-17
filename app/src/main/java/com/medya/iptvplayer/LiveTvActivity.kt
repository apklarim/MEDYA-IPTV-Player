package com.medya.iptvplayer

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class LiveTvActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livetv)

        val groups = arrayOf(
            "⭐ Favoriler",
            "🇹🇷 Türkiye",
            "⚽ Spor",
            "🎬 Film Kanalları",
            "📰 Haber",
            "📺 Belgesel",
            "👶 Çocuk"
        )

        val list = findViewById<ListView>(R.id.listGroups)
        list.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            groups
        )
    }
}
