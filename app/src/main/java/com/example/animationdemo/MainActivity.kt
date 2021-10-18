package com.example.animationdemo

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clockwise(view: View?) {
        val image: ImageView = findViewById<View>(R.id.imageView) as ImageView
        val animation: Animation = AnimationUtils.loadAnimation(applicationContext,
                R.anim.myanimation)
        image.startAnimation(animation)
    }

    fun zoom(view: View?) {
        val image: ImageView = findViewById<View>(R.id.imageView) as ImageView
        val animation1: Animation = AnimationUtils.loadAnimation(applicationContext,
                R.anim.clockwise)
        image.startAnimation(animation1)
    }

    fun fade(view: View?) {
        val image: ImageView = findViewById<View>(R.id.imageView) as ImageView
        val animation1: Animation = AnimationUtils.loadAnimation(applicationContext,
                R.anim.fade)
        image.startAnimation(animation1)
    }

    fun blink(view: View?) {
        val image: ImageView = findViewById<View>(R.id.imageView) as ImageView
        val animation1: Animation = AnimationUtils.loadAnimation(applicationContext,
                R.anim.blink)
        image.startAnimation(animation1)
    }

    fun move(view: View?) {
        val image: ImageView = findViewById<View>(R.id.imageView) as ImageView
        val animation1: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        image.startAnimation(animation1)
    }

    fun slide(view: View?) {
        val image: ImageView = findViewById<View>(R.id.imageView) as ImageView
        val animation1: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
        image.startAnimation(animation1)
    }

}