package com.example.pokebattle.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pokebattle.R
import com.example.pokebattle.databinding.FragmentStartBattleBinding


class StartBattle : Fragment() {
    private var _binding: FragmentStartBattleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStartBattleBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.startBattleBtn.setOnClickListener {
            findNavController().navigate(R.id.action_startBattle_to_choosePoke2)
        }
        return root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


