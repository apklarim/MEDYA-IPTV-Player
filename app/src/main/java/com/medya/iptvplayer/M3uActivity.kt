package com.medya.iptvplayer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class M3uActivity : AppCompatActivity() {

    private val pickFile =
        registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
            if (uri != null) {
                Toast.makeText(
                    this,
                    "Dosya seçildi: $uri",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m3u)

        findViewById<Button>(R.id.btnPickM3u).setOnClickListener {
            pickFile.launch(arrayOf("*/*"))
        }
    }
}
