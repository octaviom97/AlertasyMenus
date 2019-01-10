package com.example.octav.menus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View

class AlertCustom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_custom)
    }

    fun mostrar(view: View){
        var b = AlertDialog.Builder(this)
        var inf: LayoutInflater = layoutInflater
        var view : View = inf.inflate(R.layout.dialogcustom,null)
        b.setView(view)
        b.setPositiveButton("Si"){dialog, which ->
            finish()
        }
        b.show()

    }
    fun cambiarA(view: View){
        val intent = Intent(this@AlertCustom,DataPicker::class.java)
        startActivity(intent)
    }
}
