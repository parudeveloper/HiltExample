package com.hiltexample.simple_example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hiltexample.R
import com.hiltexample.databinding.ActivitySchoolBinding

class SchoolActivity : AppCompatActivity() {
    lateinit var binding: ActivitySchoolBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySchoolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val schoolDetails:SchoolDetails = SchoolDetails()
        binding.tvTextView.text=schoolDetails.schoolName("Nalanda Concept And Techno High School")


    }
}