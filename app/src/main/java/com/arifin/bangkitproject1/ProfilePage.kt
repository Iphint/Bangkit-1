package com.arifin.bangkitproject1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arifin.bangkitproject1.databinding.ActivityProfilePageBinding

class ProfilePage : AppCompatActivity() {
    private lateinit var binding: ActivityProfilePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        instagram
        binding.instagram.setOnClickListener{
            val instagramUrl = "https://www.instagram.com/arief_iphint997/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl))
            startActivity(intent)
        }

//        github
        binding.github.setOnClickListener{
            val githubUrl = "https://github.com/Iphint"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
            startActivity(intent)
        }

//        linkedln
        binding.linkedln.setOnClickListener{
            val linkedlnUrl = "https://www.linkedin.com/in/m-arifin-4a76b7230/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedlnUrl))
            startActivity(intent)
        }

//        get id button kembali
        binding.btnBack.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}