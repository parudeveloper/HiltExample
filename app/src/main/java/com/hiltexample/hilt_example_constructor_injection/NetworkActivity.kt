package com.hiltexample.hilt_example_constructor_injection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hiltexample.databinding.ActivityNetworkBinding

class NetworkActivity : AppCompatActivity() {
    lateinit var binding: ActivityNetworkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNetworkBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}