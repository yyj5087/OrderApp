package com.nepplus.orderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.nepplus.orderapp.Adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    fun setupEvents(){


    }
    fun setValues(){
        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter
    }
}