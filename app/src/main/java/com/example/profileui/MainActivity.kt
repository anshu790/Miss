package com.example.profileui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.profileui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val states = resources.getStringArray(R.array.states)
        val adapter = ArrayAdapter(
                this,
                R.layout.dropdown_item,
                states
        )
        with(binding.state){
            setAdapter(adapter)
        }
    }
}
