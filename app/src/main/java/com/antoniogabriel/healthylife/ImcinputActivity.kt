package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_imcinput.*

class ImcinputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcinput)

        btnResultImc.setOnClickListener {
            if(!isEmpty(edtAlt) && !isEmpty(edtPeso)){
                val peso = edtPeso.text.toString().toFloat()
                val altura = edtAlt.text.toString().toFloat()
                val resultado = String.format("%.2f", peso/(altura * altura))
                val transportresult = " $resultado "
                startActivity(Intent(this@ImcinputActivity, ImcresultActivity::class.java).apply{
                    putExtra("resultado", transportresult)
                })
            }
            else{
                Toast.makeText(
                    this@ImcinputActivity,
                    "Campo em branco!!",
                    Toast.LENGTH_LONG).show()
            }
        }
        btnHome.setOnClickListener {
            startActivity(Intent(this@ImcinputActivity, MainActivity::class.java))
            finishAffinity()
        }
    }
    private fun isEmpty(editText: EditText): Boolean {
        return if (editText.text.toString().trim { it <= ' ' }.length > 0) false else true
    }
}
