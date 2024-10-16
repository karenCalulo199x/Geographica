package com.kcals.geographica.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.kcals.geographica.databinding.ActivityMainBinding
import com.kcals.geographica.viewmodel.CountryVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CountryVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[CountryVM::class.java]
        setContentView(binding.root)

        viewModel.countries.observe(this) { data ->
            binding.test.text = data.toString()
        }

        viewModel.getCountries()
    }
}