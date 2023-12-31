package com.arifin.bangkitproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.arifin.bangkitproject1.databinding.ActivityDetailHeroBinding

class DetailHero : AppCompatActivity() {
    private lateinit var binding: ActivityDetailHeroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val heroImage = intent.getIntExtra("heroImage", R.drawable.ic_launcher_background)
        val heroTitle = intent.getStringExtra("heroTitle")
        val heroStory = intent.getStringExtra("heroStory")

        binding.fullImage.setImageResource(heroImage)
        binding.title.text = heroTitle
        binding.description.text = heroStory

        binding.btnToTop.setOnClickListener{
            binding.scrollView.smoothScrollTo(0, 0)
        }

        binding.scrollView.viewTreeObserver.addOnScrollChangedListener {
            if (binding.scrollView.scrollY == 0) {
                binding.btnToTop.visibility = View.GONE
            } else {
                binding.btnToTop.visibility = View.VISIBLE
            }
        }

        // set buat kembali
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}
