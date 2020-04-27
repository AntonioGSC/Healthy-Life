package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImc.setOnClickListener {
            startActivity(Intent(this@MainActivity, ImcinputActivity::class.java))
        }

        btnRcq.setOnClickListener {
            startActivity(Intent(this@MainActivity, RcqinputActivity::class.java))
        }

        btnSaiba.setOnClickListener {
            startActivity(Intent(this@MainActivity, SaibaActivity::class.java))
        }
    }
}
