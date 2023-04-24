package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import androidx.recyclerview.widget.RecyclerView
import java.net.URL
import java.util.Stack

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "CS4322 - Mobile Software"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        NavigationHandler.recyclerView = recyclerView
        NavigationHandler.context = this

        val callback = object: OnBackPressedCallback(
            true // default to enabled
        ) {
            override fun handleOnBackPressed() {
                NavigationHandler.pop()
            }
        }

        onBackPressedDispatcher.addCallback(callback)

        val dataset = Dataset().dataset

        NavigationHandler.push(RecyclerViewAdaptor(dataset))
        recyclerView.setHasFixedSize(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        print("this happened i guess")
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}