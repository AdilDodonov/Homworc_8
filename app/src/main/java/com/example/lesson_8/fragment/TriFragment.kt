package com.example.lesson_8.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lesson_8.R
import com.example.lesson_8.databinding.FragmentTriBinding


class TriFragment : Fragment() {

    private lateinit var binding: FragmentTriBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTriBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.getString("Name")
        binding.triFragment.setOnClickListener{
            findNavController().navigate(R.id.action_triFragment_to_blankFragment)
        }
    }
}