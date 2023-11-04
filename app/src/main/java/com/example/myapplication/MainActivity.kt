package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peach = Cat(getString(R.string.cat_name_Peach), getString(R.string.cat_description_Peach), R.drawable.animal_shelter)
        val snow = Cat(getString(R.string.cat_name_Snow), getString(R.string.cat_description_Snow), R.drawable.animal_shelter)
        val pumpkin = Cat(getString(R.string.cat_name_Pumpkin), getString(R.string.cat_description_Pumpkin), R.drawable.animal_shelter)

        val buttonDetailsPeach = findViewById<Button>(R.id.CatOneDetails)
        val buttonDetailsSnow = findViewById<Button>(R.id.CatTwoDetails)
        val buttonDetailsPumpkin = findViewById<Button>(R.id.CatThreeDetails)

        buttonDetailsPeach.setOnClickListener{
            loadDescription(getString(R.string.cat_name_Peach), getString(R.string.cat_description_Peach))
        }
        buttonDetailsSnow.setOnClickListener{
            loadDescription(getString(R.string.cat_name_Snow), getString(R.string.cat_description_Snow))
        }
        buttonDetailsPumpkin.setOnClickListener{
            loadDescription(getString(R.string.cat_name_Pumpkin), getString(R.string.cat_description_Pumpkin))
        }
    }

    fun loadDescription(name: String, description: String)
    {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("catName", name)
        intent.putExtra("catDescription", description)
        startActivity(intent)
    }

}
