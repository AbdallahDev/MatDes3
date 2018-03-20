package com.example.user.matdes3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter:FPA?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= FPA(supportFragmentManager)
        vp.adapter=adapter

        vp.addOnPageChangeListener(TabLayout.
                TabLayoutOnPageChangeListener(tabs))

        tabs.addOnTabSelectedListener(TabLayout.
                ViewPagerOnTabSelectedListener(vp))


    }

    class FPA(fm:FragmentManager) : FragmentPagerAdapter(fm)
    {
        override fun getItem(position: Int): Fragment {
            if(position==0)
                return HomeFragment()
            else if(position==1)
                return SearchFragment()
            else
                return SettingFragment()

        }

        override fun getCount(): Int {
            return 3
        }

    }
}
