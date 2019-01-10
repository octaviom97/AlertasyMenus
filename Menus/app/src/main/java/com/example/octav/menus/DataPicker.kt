package com.example.octav.menus

import android.app.DatePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_data_picker.*
import java.util.*

class DataPicker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_picker)
    }

    fun date(view: View){
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        val year = c.get(Calendar.YEAR)

        val dpd = DatePickerDialog(this, android.R.style.Theme_Holo_Dialog, DatePickerDialog.OnDateSetListener { datePicker, anio, mes, dia ->
            textView2.text ="Día: $dia Mes: ${mes+1} Año: $anio"
        }, year, month, day)

        dpd.show()

    }
    fun cambiarA(view: View){
        val intent = Intent(this@DataPicker,TimePicker::class.java)
        startActivity(intent)
    }


}
