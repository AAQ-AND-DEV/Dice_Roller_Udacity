package com.aaqanddev.diceroller_udacity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.aaqanddev.diceroller_udacity.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var diceImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main )

        binding.rollButton.text = getString(R.string.dynamic_roll)
        binding.rollButton.setOnClickListener {
            rollDice()
        }

        diceImg = binding.diceImage
    }

    private fun rollDice(){
        val randomInt = Random().nextInt(6) + 1
        val imgRes = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(imgRes)
    }
}