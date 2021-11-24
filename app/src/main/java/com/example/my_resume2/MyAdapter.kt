package com.example.my_resume2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentManager : FragmentManager,lifecycle : Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return  3
    }

    override fun createFragment(position: Int): Fragment {
         when(position){
             0 -> return PersonalInfoFragment()
             1 -> return  EducationFragment()
             2 -> return  DeclarationFragment()
             else -> return  PersonalInfoFragment()
         }
    }
}