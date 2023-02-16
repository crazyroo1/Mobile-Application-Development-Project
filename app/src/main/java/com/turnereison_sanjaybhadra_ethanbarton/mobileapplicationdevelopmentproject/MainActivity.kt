package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = listOf<Listable>(
            File("File1"),
            File("File2"),
            Folder("Folder1", listOf(
                File("Subfile1")
            )),
            Folder("Folder2", listOf())
        ) // temporary until we get data

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.adapter = RecyclerViewAdaptor(this, dataset)
        recyclerView.setHasFixedSize(true)
    }
}