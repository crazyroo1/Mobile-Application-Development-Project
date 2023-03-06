package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)

        val dataset = listOf<Listable>(
            Folder("Start Here", listOf(
                Folder("Welcome", listOf(), recyclerView),
                Folder("Syllabus", listOf(), recyclerView),
                Folder("Lab Report Instruction", listOf(), recyclerView),
                Folder("Project Instruction", listOf(), recyclerView)
            ), recyclerView),
            Folder("Learning Modules", listOf(), recyclerView)
        ) // temporary until we get data

        recyclerView.adapter = RecyclerViewAdaptor(dataset)
        recyclerView.setHasFixedSize(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}