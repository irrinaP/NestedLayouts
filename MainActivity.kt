package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var textView6: TextView
    private lateinit var textView7: TextView
    private lateinit var textView8: TextView
    private lateinit var textView9: TextView

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)

        textView4 = findViewById(R.id.textView4)
        textView5 = findViewById(R.id.textView5)
        textView6 = findViewById(R.id.textView6)

        textView7 = findViewById(R.id.textView7)
        textView8 = findViewById(R.id.textView8)
        textView9 = findViewById(R.id.textView9)

        button.setOnClickListener() { view: View ->
            if (currentIndex == 0) {

                textView2.setText((textView1.text.toString().toInt() + 1).toString())
                textView5.setText((textView4.text.toString().toInt() + 1).toString())
                textView8.setText((textView7.text.toString().toInt() + 1).toString())

                textView1.setText("")
                textView4.setText("")
                textView7.setText("")

                ++currentIndex
            } else if (currentIndex == 1) {
                textView3.setText((textView2.text.toString().toInt() + 1).toString())
                textView6.setText((textView5.text.toString().toInt() + 1).toString())
                textView9.setText((textView8.text.toString().toInt() + 1).toString())

                textView2.setText("")
                textView5.setText("")
                textView8.setText("")

                ++currentIndex
            } else if (currentIndex == 2) {
                textView1.setText((textView3.text.toString().toInt() + 1).toString())
                textView4.setText((textView6.text.toString().toInt() + 1).toString())
                textView7.setText((textView9.text.toString().toInt() + 1).toString())

                textView3.setText("")
                textView6.setText("")
                textView9.setText("")

                currentIndex = 0
            }
        }
    }
}

