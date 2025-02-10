package com.hiltexample.hilt_example

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hiltexample.R
import com.hiltexample.databinding.ActivityTeacherBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TeacherActivity : AppCompatActivity() {
    lateinit var binding: ActivityTeacherBinding

    @Inject
    lateinit var student: Student

    @Inject
    lateinit var studentMarks: StudentMarks

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTeacherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTextView.text = "${student.studentName("Mallangi Parameswar Reddy")} \n and \n Student Marks in Maths Subject is :${studentMarks.studentMarks(96)}"


    }
}