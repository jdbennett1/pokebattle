/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.pokebattle.data

import com.example.pokebattle.R
import com.example.pokebattle.model.CardInfo


object DataSource {
    val cardInfo = mapOf(
        "charizard" to
                CardInfo(
                    imageResourceId = R.drawable.chard,
                    name = "charizard",
                    description_1 = "flamethrower",
                    attack_1 = 18,
                    description_2 ="wing attack",
                    attack_2 = 17,
                ),
        "snorelax" to
                CardInfo(
                    imageResourceId = R.drawable.snore,
                    name = "Snorelax",
                    description_1 = "sleep",
                    attack_1 = 15,
                    description_2 ="hidden power",
                    attack_2 = 16,
                ),
        "venusaur" to
                CardInfo(
                    imageResourceId = R.drawable.venus,
                    name = "Venusaur",
                    description_1 = "grass whip",
                    attack_1 = 11,
                    description_2 ="vine slash",
                    attack_2 = 13,
                ),
        "blastoise" to
                CardInfo(
                    imageResourceId = R.drawable.blast,
                    name = "Blastoise",
                    description_1 = "shellshock",
                    attack_1 = 14,
                    description_2 ="water cannon",
                    attack_2 = 17,
                ),
        "arcanine" to
                CardInfo(
                    imageResourceId = R.drawable.arc,
                    name = "Arcanine",
                    description_1 = "slash",
                    attack_1 = 15,
                    description_2 ="flamethrower",
                    attack_2 = 18,
                ),
        "groudon" to
                CardInfo(
                    imageResourceId = R.drawable.grou,
                    name = "Groudon",
                    description_1 = "meltdown",
                    attack_1 = 20,
                    description_2 ="sundance",
                    attack_2 = 18,
                )
    )

}
