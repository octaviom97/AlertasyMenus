package com.example.octav.menus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView

class MenuCOntext : AppCompatActivity() {

    lateinit var lv: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_context)

        lv = findViewById(R.id.lv) as ListView
        val nombres = arrayOf("a","b","c")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nombres)
        lv.adapter = adapter as ListAdapter
        registerForContextMenu(lv)


    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu!!.setHeaderTitle("Seleccionar acción")
        menu!!.add(0,v!!.id, 0, "Arriba")
        menu!!.add(0,v!!.id, 0, "En medio")
        menu!!.add(0,v!!.id, 0, "Abajo")
    }



    fun cambiarA(view: View){
        val intent = Intent(this@MenuCOntext,MenuPop::class.java)
        startActivity(intent)
    }
}
