package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImage = findViewById<ImageView>(R.id.imageView)
        val btnRoll = findViewById<Button>(R.id.button)

        btnRoll.setOnClickListener {
            val randomNumber = Random.nextInt(6)+1

            val rolledImage = when(randomNumber){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5

                else ->R.drawable.dice_6
            }
         diceImage.setImageResource(rolledImage);
        }
    }
}
