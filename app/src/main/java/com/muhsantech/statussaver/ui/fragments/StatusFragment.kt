package com.muhsantech.statussaver.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhsantech.statussaver.R
import com.muhsantech.statussaver.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {
   private lateinit var binding: FragmentStatusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {
    }
}