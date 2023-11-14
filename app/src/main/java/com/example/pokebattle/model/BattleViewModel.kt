package com.example.pokebattle.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokebattle.data.DataSource

class BattleViewModel : ViewModel() {
    val cardInfo = DataSource.cardInfo

    private val _pokemon = MutableLiveData<CardInfo?>()
    val pokemon: LiveData<CardInfo?> = _pokemon

    private val _enemy = MutableLiveData<CardInfo?>()
    val enemy: LiveData<CardInfo?> = _enemy

    private val _attack = MutableLiveData(0)
    val attack: MutableLiveData<Int> = _attack

    private val _enemyattack = MutableLiveData(0)
    val enemy_attack: MutableLiveData<Int> = _enemyattack

    fun setPokemon(pokemon: String) {
        var num = (1..6).random()
        val enemy_pokemon = when (num) {
            1 -> "charizard"
            2 -> "snorelax"
            3 -> "venusaur"
            4 -> "blastoise"
            5 -> "arcanine"
            else -> "groudon"
        }
        _pokemon.value = cardInfo[pokemon]
        _enemy.value = cardInfo[enemy_pokemon]
    }

    fun setAttack(attack1: Int, attack2: Int){
        _attack.value = attack1
        _enemyattack.value = attack2
    }

    fun battle(): String {
        if (_attack.value!! > _enemyattack.value!!){
            return "YOU WIN!"
        }
        if (_attack.value!! < _enemyattack.value!!){
            return "YOU LOSE!"
        }
        else {
            return "IT'S A TIE!"
        }
    }



}