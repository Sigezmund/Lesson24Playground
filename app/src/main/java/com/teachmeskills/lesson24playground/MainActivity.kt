package com.teachmeskills.lesson24playground

import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.AnticipateOvershootInterpolator
import android.view.animation.BounceInterpolator
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.viewAnimation).setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.logo_animation)
            anim.fillAfter = true
            it.startAnimation(anim)
        }

        val textView = findViewById<TextView>(R.id.animatedColor)

        findViewById<ImageView>(R.id.animatorAnimation).setOnClickListener { view ->
            view.isVisible = false
//            val translationX = ObjectAnimator.ofFloat(view, "translationX", 0f, 200f).apply {
//                setInterpolator(AnticipateOvershootInterpolator())
//                setDuration(3000)
//            }
//
//            val translationY = ObjectAnimator.ofFloat(view, "translationY", 0f, 700f).apply {
//                setInterpolator(BounceInterpolator())
//                setDuration(1000)
//            }
//
//            val colorFrom = Color.RED
//            val colorTo = Color.GREEN
//            val colorAnimation = ValueAnimator.ofObject(ArgbEvaluator(), colorFrom, colorTo)
//            colorAnimation.setDuration(3000)
//            colorAnimation.addUpdateListener { animator -> textView.setTextColor(animator.animatedValue as Int) }
//            colorAnimation.start()

//            view.translationX = 0f
//            view.rotation = 0f
//            view.animate().setDuration(3000)
//                .translationX(200f)
//                .rotation(180f)
//                .setInterpolator(AnticipateOvershootInterpolator())
//                .start()

//            AnimatorSet().apply {
//                play(translationY).after(translationX)
//            }.start()

//            ValueAnimator.ofFloat(0f, 180f).apply {
//                duration = 3000
//                addUpdateListener {
//                    view.rotation = it.animatedValue as Float
//                }
//                start()
//            }
        }


    }
}