package com.example.my_resume2

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        var b1 = findViewById<Button>(R.id.button2)
//        b1.setOnClickListener {
      //  var b1  = intent.getStringExtra("button")

        var mid = resources.getIdentifier("myspeech","raw",packageName)
        var mp = MediaPlayer.create(applicationContext,mid)
        mp.start()
          //  Toast.makeText(applicationContext,"Button is Clicked",Toast.LENGTH_LONG).show()


    }
}