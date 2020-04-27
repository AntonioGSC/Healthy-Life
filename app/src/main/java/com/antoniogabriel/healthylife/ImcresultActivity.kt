package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_imcresult.*

class ImcresultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcresult)
        val resultado = intent.getStringExtra("resultado")
        txtResultadoImc.text = " $resultado "
        val siteImc = "https://www.tuasaude.com/valores-ideais-do-imc/"

        btnSite.setOnClickListener {
            startActivity(Intent(this@ImcresultActivity, WebActivity::class.java).apply{
                putExtra("site", siteImc)
            })
        }

        btnHome.setOnClickListener {
            startActivity(Intent(this@ImcresultActivity, MainActivity::class.java))
            finishAffinity()
        }
    }
}
