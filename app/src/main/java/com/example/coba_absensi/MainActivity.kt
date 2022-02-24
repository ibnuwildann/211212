package com.example.coba_absensi

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView

lateinit var cardlaporan: CardView
lateinit var cardcekdata: CardView
lateinit var keluar: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardlaporan=findViewById(R.id.cardlaporan)
        cardlaporan.setOnClickListener(){
            intent = Intent(this,laporan::class.java)
            startActivity(intent)
        }

        cardcekdata=findViewById(R.id.cardcekdata)
        cardcekdata.setOnClickListener(){
            intent = Intent(this,cekdata::class.java)
            startActivity(intent)
        }

        keluar=findViewById(R.id.btnkeluar)
        keluar.setOnClickListener(){
            Toast.makeText(this, " yah, mau kemana sih :( ", Toast.LENGTH_SHORT).show()

            val builder = AlertDialog.Builder (this)
            builder.setMessage("Yakin mau keluar?")
            builder.setCancelable(true)


            builder.setNegativeButton("Tidak", DialogInterface.OnClickListener { dialogInterface, i -> dialogInterface.cancel() })
            builder.setPositiveButton("Oke", DialogInterface.OnClickListener { dialogInterface, i -> System.exit(0) })
            //Toast.makeText(this, "Semoga harimu menyenangkan :) :) ", Toast.LENGTH_SHORT).show()

            var alertDialog = builder.create()
            alertDialog.show()
        }
    }

    override fun onBackPressed () {
        Toast.makeText(this, " yah, mau kemana sih :( ", Toast.LENGTH_SHORT).show()

        val builder = AlertDialog.Builder (this)
        builder.setMessage("Yakin mau keluar?")
        builder.setCancelable(true)

        builder.setNegativeButton("Tidak", DialogInterface.OnClickListener { dialogInterface, i -> dialogInterface.cancel() })
        //Toast.makeText(this, "gitu dong, jangan terburu-buru :) ", Toast.LENGTH_SHORT).show()
        builder.setPositiveButton("Oke", DialogInterface.OnClickListener { dialogInterface, i -> System.exit(0)})

        var alertDialog = builder.create()
        alertDialog.show()
    }


}