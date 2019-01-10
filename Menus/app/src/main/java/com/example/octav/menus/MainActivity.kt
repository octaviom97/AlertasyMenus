package com.example.octav.menus

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun alert(view : View) {
        val alerta = AlertDialog.Builder(this@MainActivity)
        alerta.setTitle("Alerta Android")
        alerta.setMessage("¿Estás seguro de que quieres salir?")
        alerta.setIcon(R.mipmap.ic_launcher)
        alerta.setPositiveButton("si"){ dialog: DialogInterface?, which: Int ->
            finish()
        }
        alerta.setNegativeButton("no"){ dialog: DialogInterface?, which: Int ->

        }
        alerta.show()
    }

    fun cambiarA(view: View){
        val intent = Intent(this@MainActivity,AlertCustom::class.java)
        startActivity(intent)
    }
}
