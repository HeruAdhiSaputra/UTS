package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2.databinding.ActivityLupapasswordBinding
import com.example.tugas2.databinding.ActivityMainBinding

class Lupapassword : AppCompatActivity() {
    private lateinit var binding: ActivityLupapasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lupapassword)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        binding = ActivityLupapasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kembali2.setOnClickListener{
            val intentHome = Intent(this,MainActivity::class.java)
            startActivity(intentHome) }
    }
}