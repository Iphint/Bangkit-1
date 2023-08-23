package com.arifin.bangkitproject1

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import com.arifin.bangkitproject1.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    private val SPLASH_DELAY: Long = 3000 // Durasi tampilan splash screen (dalam milidetik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animasi fadeIn pada logo
        val fadeIn = AlphaAnimation(0f, 1f)
        fadeIn.duration = 2000
        binding.logo.startAnimation(fadeIn)

        // Animasi fadeOut pada logo setelah durasi tampilan splash screen selesai
        Handler().postDelayed({
            val fadeOut = AlphaAnimation(3f, 0f)
            fadeOut.duration = 2000
            binding.logo.startAnimation(fadeOut)
            fadeOut.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation) {}

                override fun onAnimationRepeat(animation: Animation) {}

                override fun onAnimationEnd(animation: Animation) {
                    binding.logo.visibility = View.GONE
                    // Pindah ke activity berikutnya setelah animasi selesai
                    startActivity(Intent(this@SplashScreen, MainActivity::class.java))
                    finish()
                }
            })

        }, SPLASH_DELAY)
    }
}
