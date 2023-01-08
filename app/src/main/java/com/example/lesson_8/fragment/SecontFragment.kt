package com.example.lesson_8.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lesson_8.R
import com.example.lesson_8.databinding.FragmentSecontBinding


class SecontFragment : Fragment() {

    private lateinit var binding: FragmentSecontBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecontBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        val name = "Adi"
        bundle.putString("Name", name)
        binding.secontFragment.setOnClickListener{
            findNavController().navigate(R.id.action_secontFragment_to_triFragment,bundle)
        }
    }
}