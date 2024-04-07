package com.tlu.ltuddd.tuan2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tlu.ltuddd.R

class Tuan21MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan21_main_result)
        var tvKQ = findViewById<TextView>(R.id.tuan2TvKQ);
        val it1 = intent;
        val so1 = it1.extras!!.getString("so1")?.toFloat();
        val so2 = it1.extras!!.getString("so2")?.toFloat();
        val tong = so1?.plus(so2!!)
        tvKQ!!.text = tong.toString();


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}