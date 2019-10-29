package com.daimler.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {

        box_one_text.setOnClickListener{ makeColored(it)}
        box_two_text.setOnClickListener{ makeColored(it)}
        box_three_text.setOnClickListener{ makeColored(it)}
        box_four_text.setOnClickListener{ makeColored(it)}
        box_five_text.setOnClickListener{ makeColored(it)}
        red_button.setOnClickListener{ makeColored(it)}
        yellow_button.setOnClickListener{ makeColored(it)}
        green_button.setOnClickListener{ makeColored(it)}
    }

    private fun makeColored(view: View) {
        when (view.id) {

            //Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            //Boxes using custom colors from Background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.green_button -> box_four_text.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> box_five_text.setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
