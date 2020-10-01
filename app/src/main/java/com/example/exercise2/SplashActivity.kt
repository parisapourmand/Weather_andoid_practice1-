package com.example.exercise2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val t = Thread(Runnable {
            Thread.sleep(1600)
            val i: Intent = Intent(this@SplashActivity, DayActivity::class.java)
            startActivity(i)
            finish()
        })
        t.start()

    }
}