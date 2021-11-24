package com.example.my_resume2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    var tabTitle = arrayOf("Photo & Personal Info.","Education","Declaration")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pager = findViewById<ViewPager2>(R.id.viewPager2)
        pager.adapter = MyAdapter(supportFragmentManager,lifecycle)
        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        TabLayoutMediator(tabLayout,pager){
            tab, position ->
                tab.text = tabTitle[position]
        }.attach()
    }
}