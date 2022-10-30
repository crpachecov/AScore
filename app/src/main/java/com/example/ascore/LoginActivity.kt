package com.example.ascore

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)
    }

    fun irRegister(view: View){
        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }

}