package com.example.octav.menus

import android.app.TimePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_time_picker.*
import java.text.SimpleDateFormat
import java.util.*

class TimePicker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
    }

    fun time(view: View){
        val c = Calendar.getInstance()
        val setl = TimePickerDialog.OnTimeSetListener{ view: TimePicker?, hourOfDay: Int, minute: Int ->
            c.set(Calendar.HOUR_OF_DAY,hourOfDay)
            c.set(Calendar.MINUTE, minute)
            textView3.text = SimpleDateFormat("hh:mm").format(c.time)
        }
        TimePickerDialog(this,setl,c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),true).show()
    }

    fun cambiarA(view: View){
        val intent = Intent(this@TimePicker,MenuOptions::class.java)
        startActivity(intent)
    }
}
