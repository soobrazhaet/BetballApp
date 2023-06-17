package com.example.betballapp.ui.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betballapp.R
import com.example.betballapp.databinding.FragmentPlayBinding


class PlayFragment : Fragment(R.layout.fragment_play) {

    lateinit var binding: FragmentPlayBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayBinding.inflate(inflater, container, false)

        binding.playBtnStart.setBackgroundColor(Color.RED)

        return binding.root
    }
}