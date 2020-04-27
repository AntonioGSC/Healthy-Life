package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
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

        btnPesquisar.setOnClickListener {
            val google = "https://www.google.com/search?q="
            val google2 = "&rlz=1C1GCEB_enBR896BR896&oq=marisa&aqs=chrome..69i57j46j0j46l2j0l2j5.1490j0j9&sourceid=chrome&ie=UTF-8"
            val pesquisa = edtPesquisa.text.toString().trim()
            if(pesquisa.isEmpty()){
                Toast.makeText(this@WebActivity, "Campo Pesquisa em Branco!!", Toast.LENGTH_LONG).show()
                edtPesquisa.requestFocus()
            }
            else{
                val sitePesquisa = "$google$pesquisa$google2"
                wbvSite.loadUrl(sitePesquisa)
                wbvSite.webViewClient = WebViewClient()
            }
        }
    }
}
