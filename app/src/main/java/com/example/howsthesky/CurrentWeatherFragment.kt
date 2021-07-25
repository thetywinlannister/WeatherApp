package com.example.howsthesky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.howsthesky.databinding.FragmentCurrentWeatherBinding


class CurrentWeatherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentCurrentWeatherBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_current_weather, container, false)

        binding.apply {
            weatherTempText.text = "23°C"
            weatherDescText.text = "Thunderstorm"
            cityText.text = "Hyderabad"
            buttonCheckWeather.text = "Check Weather"
            filledtextField.hint = "Enter City"
            goToCity.text = "Go to searched cities"
            cityEditText.setText("Hyderabad")
        }
//        activity?.title = "Check Weather"
        binding.goToCity.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_currentWeatherFragment_to_recentCitiesFragment)
        )
//        binding.goToCity.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.action_currentWeatherFragment_to_recentCitiesFragment)
//        }
        return binding.root

    }


}