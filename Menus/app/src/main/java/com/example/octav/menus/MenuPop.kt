package com.example.octav.menus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu_pop.*

class MenuPop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pop)
    }

    fun pop(view: View){
        val popup = PopupMenu(this,button10)
        popup.inflate(R.menu.menu)
        popup.setOnMenuItemClickListener {
            Toast.makeText(this,"Item: "+it.title,Toast.LENGTH_SHORT).show()
            true
        }
        popup.show()
    }
}
