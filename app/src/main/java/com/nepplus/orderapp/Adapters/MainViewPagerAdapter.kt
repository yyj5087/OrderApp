package com.nepplus.orderapp.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.orderapp.fragments.MyProfileFragment
import com.nepplus.orderapp.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }

}