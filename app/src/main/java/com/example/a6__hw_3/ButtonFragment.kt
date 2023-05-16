package com.example.a6__hw_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.a6__hw_3.databinding.FragmentButtonBinding

class ButtonFragment : Fragment() {

    private lateinit var binding: FragmentButtonBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        initListeners()
    }

    private fun initListeners() {
        binding.btnPlus.setOnClickListener {
            viewModel.increment()
        }

        binding.btnMinus.setOnClickListener {
            viewModel.decrement()
        }
    }
}