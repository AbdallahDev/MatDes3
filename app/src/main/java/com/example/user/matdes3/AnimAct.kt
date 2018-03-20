package com.example.user.matdes3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_anim.*

class AnimAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim)

        button.setOnClickListener {

            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(5)
                    .playOn(textView)

        }
    }
}
