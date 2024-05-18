package com.sci.fragmentstest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnFragmentActivity: Button
    private lateinit var btnNextActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Fragments====>", "onCreate MainActivity")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnFragmentActivity = findViewById(R.id.btn_fragment_activity)
        btnFragmentActivity.setOnClickListener {
            FragmentActivity.newInstance(this).also { startActivity(it) }
        }

        btnNextActivity = findViewById(R.id.btn_next_activity)
        btnNextActivity.setOnClickListener {
            NextActivity.newInstance(this).also { startActivity(it) }
        }
    }

    override fun onStart() {
        Log.i("Fragments====>", "onStart MainActivity")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Fragments====>", "onResume MainActivity")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Fragments====>", "onPause MainActivity")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Fragments====>", "onStop MainActivity")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Fragments====>", "onDestroy MainActivity")
        super.onDestroy()
    }
}