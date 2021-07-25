package com.example.howsthesky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.howsthesky.databinding.FragmentRecentCitiesBinding

class RecentCitiesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentRecentCitiesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_recent_cities, container, false
        )
        activity?.title = "Recent Cities"
        binding.goToWeather.text = "Go To City"
        binding.goToWeather.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_recentCitiesFragment_to_currentWeatherFragment)
        )
        return binding.root
    }


}