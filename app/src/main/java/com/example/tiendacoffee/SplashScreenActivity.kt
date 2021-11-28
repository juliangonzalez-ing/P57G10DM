package com.example.tiendacoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.tiendacoffee.databinding.ActivitySplashScreenBinding
import com.example.tiendacoffee.R


class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


       binding= ActivitySplashScreenBinding.inflate(layoutInflater)

        val view=binding.root
        setContentView(view)
        //setContentView(R.layout.splashscreen)
        //setContentView(R.layout.bienvenida)

        val animation = AnimationUtils.loadAnimation(this,R.anim.animation)
        binding.imageViewSplash.startAnimation(animation)
        binding.textView.startAnimation(animation)

        val intent=Intent(this,MainActivity::class.java)

        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
    }
}