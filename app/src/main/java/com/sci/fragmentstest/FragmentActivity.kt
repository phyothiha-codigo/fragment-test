package com.sci.fragmentstest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FragmentActivity : AppCompatActivity() {
    private lateinit var btnAddRemoveFragment: Button
    private var isFragmentAdded: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Fragments====>", "onCreate FragmentActivity")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnAddRemoveFragment = findViewById(R.id.btn_add_or_remove_fragment)
        btnAddRemoveFragment.setOnClickListener {
            if (isFragmentAdded) {
                //Fragment Transactions
                removeFragment()
            } else {
                //Fragment Transactions
                addFragment()
            }
            isFragmentAdded = !isFragmentAdded
            updateButton()
        }
    }

    private fun addFragment() {
        //1. Create Fragment -> Static Factory Method
        //2. supportFragmentManager => Fragment Transaction
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, FragmentOne.newInstance(), "fragment_one")
            .commit()
    }

    private fun removeFragment() {
        supportFragmentManager
            .beginTransaction()
            .remove(supportFragmentManager.findFragmentByTag("fragment_one")!!)
            .commit()
    }

    private fun updateButton() {
        btnAddRemoveFragment.text = if (isFragmentAdded) "Remove Fragment 1" else "Add Fragment 1"
    }

    override fun onStart() {
        Log.i("Fragments====>", "onStart FragmentActivity")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Fragments====>", "onResume FragmentActivity")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Fragments====>", "onPause FragmentActivity")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Fragments====>", "onStop FragmentActivity")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Fragments====>", "onDestroy FragmentActivity")
        super.onDestroy()
    }

    companion object {
        fun newInstance(ctx: Context): Intent = Intent(
            ctx, FragmentActivity::class.java
        )
    }
}