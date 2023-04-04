package com.example.uidesigns

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.uidesigns.databinding.ActivityMain2Binding
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    @SuppressLint("AppCompatMethod", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //Bottom Navigation
        val navController=findNavController(R.id.fragment_holder)
        NavigationUI.setupWithNavController(binding.bnvMenu,navController)

    }
}
