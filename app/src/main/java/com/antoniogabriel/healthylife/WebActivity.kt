package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_imcresult.*
import kotlinx.android.synthetic.main.activity_web.*
import kotlinx.android.synthetic.main.activity_web.btnHome

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val site = intent.getStringExtra("site")
        wbvSite.settings.javaScriptEnabled = true
        wbvSite.loadUrl(site)
        wbvSite.webViewClient = WebViewClient()

        btnHome.setOnClickListener {
            startActivity(Intent(this@WebActivity, MainActivity::class.java))
            finishAffinity()
        }
    }
}
