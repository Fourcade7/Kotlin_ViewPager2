package com.pr7.kotlin_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class SlideAdapter constructor(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle,
    val fragmentArraylist:ArrayList<Fragment>
    ): FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int =fragmentArraylist.size
    override fun createFragment(position: Int): Fragment =fragmentArraylist.get(position)
}