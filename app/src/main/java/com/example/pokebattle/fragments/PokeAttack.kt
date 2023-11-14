package com.example.pokebattle.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.pokebattle.R
import com.example.pokebattle.databinding.FragmentPokeAttackBinding
import com.example.pokebattle.model.BattleViewModel

class PokeAttack : Fragment() {
    private var _binding: FragmentPokeAttackBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: BattleViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPokeAttackBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            pokeAttack = this@PokeAttack
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    fun goToNextScreen() {
        findNavController().navigate(R.id.action_pokeAttack_to_battleResults)
    }
    fun goBackToScreen() {
        findNavController().navigate(R.id.action_pokeAttack_to_choosePoke2)
    }


}