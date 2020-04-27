package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_imcresult.*
import kotlinx.android.synthetic.main.activity_rcqresult.*

class RcqresultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcqresult)
        val resultado = intent.getStringExtra("resultadoRcq")
        txtResultadoRcq.text = " $resultado "
        val siteRcq = "https://www.informaluiz.net/relacao-cintura-quadril-uma-forma-simples-de-estimar-o-risco-de-doenca-cronica/"

        btnSite2.setOnClickListener {
            startActivity(Intent(this@RcqresultActivity, WebActivity::class.java).apply{
                putExtra("site", siteRcq)
            })
        }

        btnHomeRcqR.setOnClickListener {
            startActivity(Intent(this@RcqresultActivity, MainActivity::class.java))
            finishAffinity()
        }
    }
}
