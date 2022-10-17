package com.example.app_rospatent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.app_rospatent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }

    fun onClickSearch(view: View) {
        if (bindingClass.edSearchPatent?.text.toString() == "") {
            Toast.makeText(applicationContext, "Необходимо заполнить поле", Toast.LENGTH_LONG).show()
        }
        else{
            val intent = Intent(this, SpisokActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
