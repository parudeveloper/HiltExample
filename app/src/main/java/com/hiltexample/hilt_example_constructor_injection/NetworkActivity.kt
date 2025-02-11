package com.hiltexample.hilt_example_constructor_injection

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.hiltexample.databinding.ActivityNetworkBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NetworkActivity : AppCompatActivity() {
    lateinit var viewModel: NetWorkViewModel
    lateinit var binding: ActivityNetworkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNetworkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel= ViewModelProvider(this).get(NetWorkViewModel::class.java)
        Log.i("NetWorkActivity", viewModel.getNetworkServiceData())
        Log.i("NetWorkActivity", viewModel.getApplicationService())

    }
}