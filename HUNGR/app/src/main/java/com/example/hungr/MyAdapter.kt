package com.example.hungr

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.hungr.volunteering.Volunteering

@Suppress("DEPRECATION")
internal class MyAdapter(
    var context: Context,
    supportFragmentManager: FragmentManager,
    var totalTabs: Int
):
    FragmentPagerAdapter(supportFragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                FoodBank()
            }
            1 -> {
                Volunteering()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}
