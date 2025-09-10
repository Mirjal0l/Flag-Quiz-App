package com.example.quizflagsapp

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizflagsapp.ui.QuestionsActivity
import com.example.quizflagsapp.utils.Constants

class MainActivity : AppCompatActivity() {
    private lateinit var infoButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.button_start)
        val editTextName: EditText = findViewById(R.id.name)
        infoButton = findViewById<ImageButton>(R.id.info_btn)

        infoButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.info_dialog)
            dialog.setCanceledOnTouchOutside(true)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.show()

        }

        startButton.setOnClickListener {
            if (!editTextName.text.isEmpty()) {
                Intent(this@MainActivity, QuestionsActivity::class.java).also {
                    it.putExtra(Constants.USER_NAME, editTextName.text.toString())
                    startActivity(it)
                    finish()
                }
            } else {
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_LONG).show()
            }
        }
    }
}