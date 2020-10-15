package com.example.snackbar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.cadastro_body.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        btn_cadastro.setOnClickListener {
            Snackbar.make(it, "Cadastro realizado com sucesso!", Snackbar.LENGTH_LONG)
                .addCallback(object : Snackbar.Callback() {
                    override fun onDismissed(snackbar: Snackbar, event: Int) {
                        super.onDismissed(snackbar, event)
                        val intent = Intent(this@CadastroActivity, MainActivity::class.java)
                        startActivity(intent)
                    }
                }).show()
        }
    }
}