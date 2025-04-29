package com.example.zadanie2221_animationpt1

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.zadanie2221_animationpt1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

          val animation = AnimationUtils.loadAnimation(this, R.anim.rocket_anim_2)

        binding.rocketView.setOnClickListener {
                  binding.rocketView.startAnimation(animation)

        }
    }
}

//    private fun startCircularAnimation() {
//        // Длительность анимации в миллисекундах
//        val duration = 15000L
//
//        // Создание анимации по окружности
//        val animator = ObjectAnimator.ofFloat(-10f, (2 * Math.PI).toFloat())
//        animator.duration = duration
//        animator.interpolator = LinearInterpolator()
//
//        animator.addUpdateListener { animation ->
//            val angle = animation.animatedValue as Float
//            // Вычисляем новые координаты X и Y
//            val x = (centerX + radius * Math.cos(angle.toDouble())).toFloat()
//            val y = (centerY + radius * Math.sin(angle.toDouble())).toFloat()
//
//            myImage.x = x
//            myImage.y = y
//        }
//
//        // animator.repeatCount = ObjectAnimator.INFINITE
//        // animator.start()
//
//        binding.rocketView.setOnClickListener {
//           animator.start()

//            }
//        }
//    }
//
