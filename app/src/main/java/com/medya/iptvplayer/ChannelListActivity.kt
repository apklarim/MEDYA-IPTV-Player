package com.medya.iptvplayer

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChannelListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_channel_list)

        val groupName = intent.getStringExtra("groupName") ?: "Kanallar"

        findViewById<TextView>(R.id.txtGroupTitle).text = groupName

        val channels = arrayOf(
            "TRT 1",
            "ATV",
            "KANAL D",
            "SHOW TV",
            "STAR TV",
            "TV8",
            "A HABER",
            "NTV"
        )

        val list = findViewById<ListView>(R.id.listChannels)

        list.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            channels
        )
    }
}
