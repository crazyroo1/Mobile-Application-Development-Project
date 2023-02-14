package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = listOf<Unit>() // temporary until we get data

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.adapter = RecyclerViewAdaptor(this, listOf())
        recyclerView.setHasFixedSize(true)
    }
}