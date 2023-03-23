package kr.hs.emirim.codelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener{
            Toast.makeText(applicationContext, "짜잔", Toast.LENGTH_SHORT).show()
        }
    }
}