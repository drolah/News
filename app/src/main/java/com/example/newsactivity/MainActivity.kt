package com.example.newsactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            showFirstFragment()
        }
    }

    private fun showFirstFragment() {
        val firstFragment = HeadlinesFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.portraitFirstContainer, firstFragment)
            .commit()
    }

    fun onItemSelected(item: String) {
        val secondFragment = ContentFragment().apply {
            setDetailText(item)
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.portraitFirstContainer, secondFragment)
            .addToBackStack(null)  // Add to back stack if you want to navigate back
            .commit()
    }
}