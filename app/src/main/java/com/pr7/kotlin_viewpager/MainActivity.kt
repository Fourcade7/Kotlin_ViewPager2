package com.pr7.kotlin_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.pr7.kotlin_viewpager.fragments.BlankFragment
import com.pr7.kotlin_viewpager.fragments.BlankFragment2

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var viewPager2: ViewPager2
    val arraylist=ArrayList<Fragment>()
    lateinit var slideAdapter: SlideAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager2=findViewById(R.id.viewpager2)
        button=findViewById(R.id.buttonnext)
        arraylist.add(BlankFragment())
        arraylist.add(BlankFragment2())
        slideAdapter= SlideAdapter(supportFragmentManager,lifecycle,arraylist)
        viewPager2.adapter=slideAdapter

        button.setOnClickListener {
            viewPager2.currentItem=viewPager2.currentItem+1
        }
        
    }

//    fun go_timer(){
//        val handler=Handler()
//        val runnable=object :Runnable{
//            override fun run() {
//                a++
//                Log.d(TAG, "run: a= $a")
//
//            }
//        }
//
//        val timer=Timer()
//        val timertask=object : TimerTask() {
//            override fun run() {
//                b++
//                handler.post(runnable)
//                Log.d(TAG, "run:b= $b")
//                if (b==10){
//                    timer.cancel()
//                }
//            }
//        }
//        timer.schedule(timertask,250,1000)
//
////        Handler().postDelayed({
////            //something
////        },2000)
//    }
}