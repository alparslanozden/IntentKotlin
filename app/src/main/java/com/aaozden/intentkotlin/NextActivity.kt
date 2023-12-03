package com.aaozden.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aaozden.intentkotlin.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intentFromMain = intent // getIntent()
        val name = intentFromMain.getStringExtra("name")
        val myInteger = intentFromMain.getIntExtra("myinteger",-1)
        println(myInteger)
        binding.nameText.text = "Name: ${name}"

    }




}