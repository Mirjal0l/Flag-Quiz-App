package com.example.quizflagsapp.ui

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizflagsapp.MainActivity
import com.example.quizflagsapp.R
import com.example.quizflagsapp.utils.Constants
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    private lateinit var textView_score: TextView
    private lateinit var textView_name: TextView
    private lateinit var finish_button: Button
    private lateinit var info_button: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textView_score = findViewById<TextView>(R.id.tv_score)
        textView_name = findViewById<TextView>(R.id.tv_name)
        finish_button = findViewById<Button>(R.id.btn_finish)
        info_button = findViewById<ImageButton>(R.id.info_btn)

        info_button.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.info_dialog)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setCanceledOnTouchOutside(true)
            dialog.show()
        }

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val score = intent.getIntExtra(Constants.SCORE, 0)
        val name = intent.getStringExtra(Constants.USER_NAME)

        textView_score.text = "Your score $score out of $totalQuestions"
        textView_name.text = name

        finish_button.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}