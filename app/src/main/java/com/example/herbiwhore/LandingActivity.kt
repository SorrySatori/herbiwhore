package com.example.herbiwhore

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class LandingActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_test , menu)

        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item != null)
            when(item.itemId){
                R.id.prehled -> {
                    setContentView(R.layout.activity_landing)
                }
                R.id.encyklopedie -> {
                    setContentView(R.layout.encyklopedie)
                }
                R.id.kalendar -> {
                    setContentView(R.layout.calendar)
                }
                R.id.mapa
                -> {
                    setContentView(R.layout.map)
                }
            }

        return true
    }
}