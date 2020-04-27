package com.antoniogabriel.healthylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_imcinput.*
import kotlinx.android.synthetic.main.activity_rcqinput.*

class RcqinputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcqinput)

        btnResultRcq.setOnClickListener {
            if(!isEmpty(edtCintura) && !isEmpty(edtQuadril)){
                val cintura = edtCintura.text.toString().toFloat()
                val quadril = edtQuadril.text.toString().toFloat()
                val resultadoRcq = String.format("%.2f", cintura/quadril)
                val transportResultRcq = "$resultadoRcq"
                startActivity(Intent(this@RcqinputActivity, RcqresultActivity::class.java).apply{
                    putExtra("resultadoRcq", transportResultRcq)
                })
            }
            else{
                Toast.makeText(
                    this@RcqinputActivity,
                    "Campo em branco!!",
                    Toast.LENGTH_LONG).show()
            }
        }

        btnHomeRcq.setOnClickListener {
            startActivity(Intent(this@RcqinputActivity, MainActivity::class.java))
            finishAffinity()
        }
    }
    private fun isEmpty(editText: EditText): Boolean {
        return if (editText.text.toString().trim { it <= ' ' }.length > 0) false else true
    }
}
