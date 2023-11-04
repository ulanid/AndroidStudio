package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val args = intent.extras

        val textName = findViewById<TextView>(R.id.catName)
        val textDesc = findViewById<TextView>(R.id.catDescription)

        textName.text = args?.getString("catName")
        textDesc.text = args?.getString("catDescription")
    }
}
