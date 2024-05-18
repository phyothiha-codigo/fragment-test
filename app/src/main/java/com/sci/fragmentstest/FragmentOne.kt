package com.sci.fragmentstest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {

    private lateinit var btnFragmentTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Fragments====>", "onCreate FragmentOne")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragments====>", "onCreateView FragmentOne")
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("Fragments====>", "onViewCreated FragmentOne")
        super.onViewCreated(view, savedInstanceState)
        btnFragmentTwo = view.findViewById(R.id.btn_fragment_two)
        btnFragmentTwo.setOnClickListener {
            //Go to Fragment 2
            //1. Create Frag 2
            //2. Fra1 -> Fra2 => supportFragManager <= Activity Level or Fragment ?
            //3. How to get access to supportFragManager
            requireActivity()
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, FragmentTwo.newInstance(), "fragment_two")
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onStart() {
        Log.i("Fragments====>", "onStart FragmentOne")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Fragments====>", "onResume FragmentOne")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Fragments====>", "onPause FragmentOne")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Fragments====>", "onStop FragmentOne")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("Fragments====>", "onDestroyView FragmentOne")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("Fragments====>", "onDestroy FragmentOne")
        super.onDestroy()
    }

    companion object {
        fun newInstance(): FragmentOne = FragmentOne()
    }
}