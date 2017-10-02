package com.codingblocks.testing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcFare.setOnClickListener( {
            result.text =
                    calcFare(
                            etkm.text.toString().toFloat(),
                            etmin.text.toString().toFloat()
                    ).toString()

        })
    }

    companion object {
         @JvmStatic fun calcFare(km:Float, min:Float) :Float =
            50f + (if(km>5) (km-5)*12 else 0f) + (if(min>15) (min-15) else 0f)
    }
}
