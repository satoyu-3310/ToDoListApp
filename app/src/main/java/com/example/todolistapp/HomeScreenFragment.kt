package com.example.todolistapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.todolistapp.databinding.FragmentHomeScreenBinding

class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeScreenBinding.bind(view)

        binding.button1.setOnClickListener {
            findNavController().navigate(
                HomeScreenFragmentDirections.actionHomeScreenFragmentToCreateListScreenFragment()
            )
        }
    }
}