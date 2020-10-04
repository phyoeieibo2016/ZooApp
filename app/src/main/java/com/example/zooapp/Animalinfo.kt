package com.example.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animalinfo.*

class Animalinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animalinfo)

        val bundle: Bundle? = intent.extras
        val image = bundle?.getInt("image")
        val name = bundle?.getString("name")
        val des = bundle?.getString("des")

        ivAnimalimage.setImageResource(image!!)
        tvName.text = name
        tvDes.text = des

    }
}