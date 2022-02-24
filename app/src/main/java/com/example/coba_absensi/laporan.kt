package com.example.coba_absensi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

lateinit var btnkeluar : Button

class laporan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporan)

        btnkeluar =findViewById(R.id.esxit)
        btnkeluar.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}