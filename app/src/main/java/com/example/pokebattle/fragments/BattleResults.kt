package com.example.pokebattle.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.pokebattle.R
import com.example.pokebattle.databinding.FragmentBattleResultsBinding
import com.example.pokebattle.model.BattleViewModel


class BattleResults : Fragment() {
    private var _binding: FragmentBattleResultsBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: BattleViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBattleResultsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            battleResults = this@BattleResults

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    fun goBackToScreen() {
        findNavController().navigate(R.id.action_battleResults_to_startBattle)
    }

}