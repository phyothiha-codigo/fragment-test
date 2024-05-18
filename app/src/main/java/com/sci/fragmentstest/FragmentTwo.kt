package com.sci.fragmentstest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Fragments====>", "onCreate FragmentTwo")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragments====>", "onCreateView FragmentTwo")
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("Fragments====>", "onViewCreated FragmentTwo")
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
            requireActivity()
                .supportFragmentManager
                .popBackStack()
        }
    }

    override fun onStart() {
        Log.i("Fragments====>", "onStart FragmentTwo")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Fragments====>", "onResume FragmentTwo")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Fragments====>", "onPause FragmentTwo")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Fragments====>", "onStop FragmentTwo")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("Fragments====>", "onDestroyView FragmentTwo")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("Fragments====>", "onDestroy FragmentTwo")
        super.onDestroy()
    }

    companion object {
        fun newInstance(): FragmentTwo = FragmentTwo()
    }
}