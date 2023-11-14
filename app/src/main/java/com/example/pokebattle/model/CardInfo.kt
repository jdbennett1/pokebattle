package com.example.pokebattle.model

import androidx.annotation.DrawableRes

data class CardInfo(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val description_1: String,
    val attack_1: Int,
    val description_2: String,
    val attack_2: Int,
)

{
    fun FormattedAttack1(): String = attack_1.toString()
    fun FormattedAttack2(): String = attack_2.toString()
}