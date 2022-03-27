package com.example.firebaselogin
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.firebaselogin.databinding.ActivitySplashBinding
class Splash : AppCompatActivity() {
    lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lottieAnimationSplash.animate().translationY(2500F).setDuration(500L).startDelay = 2500L
        toLogin()
    }

    private fun toLogin(){
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}