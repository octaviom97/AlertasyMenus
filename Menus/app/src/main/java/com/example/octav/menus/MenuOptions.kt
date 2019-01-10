package com.example.octav.menus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MenuOptions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_options)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

//    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        menu?.getItem(2)?.setEnabled(false)
//        menu?.getItem(1)?.isVisible= false
//        return super.onPrepareOptionsMenu(menu)
//    }

     override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item1 -> {
                if (item.isChecked()) item.setChecked(false)
                else item.setChecked(true)
                return super.onOptionsItemSelected(item)

            }
            R.id.item2 -> {
                if (item.isChecked()) item.setChecked(false)
                else item.setChecked(true)
                Toast.makeText(this,"Opción 2", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)

            }
            R.id.item3 -> {
                if (item.isChecked()) item.setChecked(false)
                else item.setChecked(true)
                Toast.makeText(this,"Opción 3",Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)

            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
    fun cambiarA(view: View){
        val intent = Intent(this@MenuOptions,MenuCOntext::class.java)
        startActivity(intent)
    }
}
