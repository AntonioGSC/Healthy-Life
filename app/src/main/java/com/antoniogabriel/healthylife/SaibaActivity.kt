package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rcqinput.*
import kotlinx.android.synthetic.main.activity_rcqresult.*
import kotlinx.android.synthetic.main.activity_saiba.*

class SaibaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saiba)

        val siteImc = "https://www.saude.gov.br/artigos/781-atividades-fisicas/40389-o-que-e-imc"
        val siteRcq = "https://www.saude.gov.br/component/content/article/804-imc/40508"

        btnSiteImc.setOnClickListener {
            startActivity(Intent(this@SaibaActivity, WebActivity::class.java).apply{
                putExtra("site", siteImc)
            })
        }

        btnSiteRcq.setOnClickListener {
            startActivity(Intent(this@SaibaActivity, WebActivity::class.java).apply{
                putExtra("site", siteRcq)
            })
        }

        btnHomeSaiba.setOnClickListener {
            startActivity(Intent(this@SaibaActivity, MainActivity::class.java))
            finishAffinity()
        }
    }
}
