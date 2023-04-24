package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.activity.OnBackPressedCallback
import androidx.recyclerview.widget.RecyclerView
import com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject.ui.login.LoginFragment
import java.net.URL
import java.util.Stack

class MainActivity : AppCompatActivity(), LoginFragment.OnFragmentDismissedListener {
    private lateinit var rootView: ViewGroup
    private var fragmentContainer: FrameLayout? = null


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

        rootView = findViewById(android.R.id.content)
        fragmentContainer = FrameLayout(this).apply {
            id = View.generateViewId()
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setBackgroundColor(Color.WHITE)
        }
        rootView.addView(fragmentContainer)

        val myFragment = LoginFragment().apply {
            onFragmentDismissedListener = this@MainActivity
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(fragmentContainer!!.id, myFragment)
                .commit()
        }
    }

    override fun onFragmentDismissed() {
        fragmentContainer?.let { rootView.removeView(it) }
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