package com.hiltexample.limelive_mobile_coding.view

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.hiltexample.R
import com.hiltexample.databinding.ActivityLimeMainBinding
import com.hiltexample.limelive_mobile_coding.data.Resource
import com.hiltexample.limelive_mobile_coding.viewmodel.PostsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LimeMainActivity : AppCompatActivity() {
    lateinit var postsViewModel: PostsViewModel
    lateinit var binding: ActivityLimeMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLimeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postsViewModel = ViewModelProvider(this)[PostsViewModel::class.java]

        lifecycleScope.launch {
            postsViewModel.posts.collectLatest { response ->
                when (response) {
                    is Resource.Loading -> {
                        Log.d("LimeMainActivity","Loading State")
                    }
                    is Resource.Success -> {
                        Log.d("LimeMainActivity",response.data.toString())
                    }
                    is Resource.Error -> {
                        Log.d("LimeMainActivity",response.message.toString())
                    }
                }
            }
        }



    }

}