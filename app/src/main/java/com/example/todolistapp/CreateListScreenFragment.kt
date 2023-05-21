package com.example.todolistapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.todolistapp.databinding.FragmentCreateListScreenBinding


class CreateListScreenFragment : Fragment(R.layout.fragment_create_list_screen) {
    private lateinit var binding: FragmentCreateListScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreateListScreenBinding.bind(view)

        binding.button1.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}